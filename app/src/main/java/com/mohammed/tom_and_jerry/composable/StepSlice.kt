package com.mohammed.tom_and_jerry.composable

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.ui.theme.Primary


@Composable
fun StepSlice(
    stepNumber: Int,
    stepDescription: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .border(1.dp, Color(0xFFD0E5F0), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stepNumber.toString(),
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = Primary
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = stepDescription,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0x99121212)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StepSlicePreview() {
    Column(
        modifier = Modifier
            .background(Color(0xFFF1F8FB))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        StepSlice(1, "Put the pasta in a toaster.")
        StepSlice(2, "Pour battery juice over it.")
        StepSlice(3, "Wait for the spark to ignite.")
        StepSlice(4, "Serve with an insulating glove.")
    }
}
