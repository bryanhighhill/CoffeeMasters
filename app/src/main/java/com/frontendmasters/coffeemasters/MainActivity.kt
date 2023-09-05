package com.frontendmasters.coffeemasters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.frontendmasters.coffeemasters.ui.theme.CoffeeMastersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var dataManager = ViewModelProvider(this)
            .get(DataManager::class.java)
        setContent {
            CoffeeMastersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

//Composable - UI component
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun FirstComposable() {
    var firstName = remember { mutableStateOf("") }
    var lastName = remember { mutableStateOf("") }
    //Column is a lambda expression
    Column() {
//  Row() {
        Text(
            "Hello ${firstName.value} ${lastName.value}",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
        )
        TextField(value = firstName.value, onValueChange = {
            firstName.value = it
        } )
        TextField(value = lastName.value, onValueChange = {
            lastName.value = it
        })
    }
}























