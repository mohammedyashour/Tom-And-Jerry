package com.mohammed.tom_and_jerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.mohammed.tom_and_jerry.ui.theme.TextMain
import java.nio.file.WatchEvent

@Composable
fun CharacterCard(
    backgroundColor: Color,
    name: String,
    description: String,
    imageRes: Int

) {
    Box(

        modifier = Modifier
            .height(104.dp)
            .width(140.dp)
            .background(backgroundColor)
            .clip(RoundedCornerShape(16.dp))
            .padding(horizontal = 24.dp), contentAlignment = Alignment.Center


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 20.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)

            ) {
            Text(name, fontSize = 18.sp, fontWeight = FontWeight.Medium, color = TextMain)
            Text(
                description,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0x991F1F1E)
            )
        }
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = (-30).dp)
                .size(64.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterCardPreview() {
    CharacterCard(
        backgroundColor = Color(0xFFFCF2C5),
        name = "Tom",
        description = "Failed stalker",
        imageRes = R.drawable.tom

    )
}