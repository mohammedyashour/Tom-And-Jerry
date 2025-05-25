package com.mohammed.tom_and_jerry.composable

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.R

import kotlin.math.cos
import kotlin.math.sin


@Composable
fun StatCard(
    value: String,
    label: String,
    backgroundColor: Color,
    iconRes: Int,
    iconColor: Color,
    percentage: Float,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .width(160.dp)
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Canvas(modifier = Modifier.matchParentSize()) {
                drawCircle(color = Color.White)

                val sweepAngle = 360 * percentage
                drawArc(
                    color = iconColor,
                    startAngle = -90f,
                    sweepAngle = sweepAngle,
                    useCenter = false,
                    style = Stroke(width = 2.dp.toPx())
                )

                val radius = size.minDimension / 2
                val angleRad = Math.toRadians((sweepAngle - 90).toDouble())
                val dotX = center.x + radius * cos(angleRad).toFloat()
                val dotY = center.y + radius * sin(angleRad).toFloat()
                drawCircle(
                    color = iconColor,
                    radius = 4.dp.toPx(),
                    center = Offset(dotX, dotY)
                )
            }

            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text(
                text = value,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                color = Color(0x99121212)
            )
            Text(
                text = label,
                fontSize = 12.sp,
                color = Color(0x5E121212)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatCardPreview() {
    StatCard(
        value = "2M 12K",
        label = "No. of quarrels",
        backgroundColor = Color(0xFFD0E5F0),
        iconRes = R.drawable.ic_cat,
        iconColor = Color(0xFF075174),
        percentage = 0.85f
    )


}