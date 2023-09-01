package com.frontendmasters.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frontendmasters.coffeemasters.ui.theme.Alternative2

//type prev, then tab to complete
@Preview(showBackground = true, widthDp = 400)
@Composable
private fun Offer_Preview() {
    Offer("My Title 1", "This is the description")
}

@Preview(showBackground = true)
@Composable
fun OffersPage() {
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer(title = "Early Coffee", description = "10% off. Offer valid from 6am to 9am.")
        Offer(title = "Welcome Gift", description = "25% off on your first order.")
    }
}

@Composable
fun Offer(title: String, description: String ) {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.background_pattern),
            contentDescription = "Background pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)
            )
        }
    }
}