package com.frontendmasters.coffeemasters

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//type prev, then tab to complete
@Preview(showBackground = true, widthDp = 400)
@Composable
fun Offer() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "My Title",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
            )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Description",
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
            )
    }
}