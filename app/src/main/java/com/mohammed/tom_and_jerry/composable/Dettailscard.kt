package com.mohammed.tom_and_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.R
import com.mohammed.tom_and_jerry.ui.theme.Primary

@Composable
fun DetailCard(
    iconRes: Int,
    value: String,
    label: String
) {
    Box(
        modifier = Modifier
            .size(104.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFD0E5F0)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = Primary,
                modifier = Modifier.size(32.dp)
            )

            androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = value,
                fontSize = 14.sp,
                color = Color(0x99121212),
                fontWeight = FontWeight.SemiBold
            )

            androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = label,
                fontSize = 12.sp,
                color = Color(0x5E121212),
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailCardPreview() {
    DetailCard(
        iconRes = R.drawable.ic_cart,
        value = "1000 V",
        label = "Temperature"
    )
}