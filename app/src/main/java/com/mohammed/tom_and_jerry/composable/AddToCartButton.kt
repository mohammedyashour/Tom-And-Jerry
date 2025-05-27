package com.mohammed.tom_and_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AddToCartButton(
    modifier: Modifier = Modifier,
    currentPrice: String,
    originalPrice: String,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF226993)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Add to cart",
                color = Color.White.copy(alpha = 0.87f),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "•",
                color = Color.White.copy(alpha = 0.5f),
                fontSize = 18.sp
            )
            Column {
                Text(
                    text = "$currentPrice cheeses",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "$originalPrice cheeses",
                    color = Color.White.copy(alpha = 0.8f),
                    fontWeight = FontWeight.Medium,

                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddToCartButtonPreview() {
    Column(
        Modifier
            .background(Color.White)
            .padding(16.dp)
    ) {
        AddToCartButton(
            currentPrice = "3",
            originalPrice = "5"
        )
    }
}
