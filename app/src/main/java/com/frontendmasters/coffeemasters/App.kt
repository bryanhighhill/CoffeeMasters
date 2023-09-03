@file:OptIn(ExperimentalMaterial3Api::class)

package com.frontendmasters.coffeemasters

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.frontendmasters.coffeemasters.pages.InfoPage
import com.frontendmasters.coffeemasters.pages.MenuPage
import com.frontendmasters.coffeemasters.pages.OffersPage
import com.frontendmasters.coffeemasters.pages.OrderPage
import com.frontendmasters.coffeemasters.ui.theme.CoffeeMastersTheme

@Preview
@Composable
fun App_Preview() {
    CoffeeMastersTheme() {
        App()
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
    var selectedRoute = remember {
        mutableStateOf("menu")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { AppTitle() },
                )
        },
        content = {
            when(selectedRoute.value) {
                Routes.MenuPage.route -> MenuPage()
                Routes.OffersPage.route -> OffersPage()
                Routes.OrderPage.route -> OrderPage()
                Routes.InfoPage.route -> InfoPage()
            }
        },
        bottomBar = {
            NavBar(
                selectedRoute = selectedRoute.value,
                onChange = {newRoute ->
                selectedRoute.value = newRoute
            })
        }
    )
}


@Composable
fun AppTitle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF43281C))
    ) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Coffee Masters Logo")

    }
}