package com.mohammed.tom_and_jerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.mohammed.tom_and_jerry.R
import com.mohammed.tom_and_jerry.composable.CharacterCard
import com.mohammed.tom_and_jerry.composable.EpisodeCard
import com.mohammed.tom_and_jerry.ui.theme.Primary
import com.mohammed.tom_and_jerry.ui.theme.TextMain


@Composable
fun SecretEpisodesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFF8FF))
            .verticalScroll(rememberScrollState())
    ) {
        SecretEpisodesHeader()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Most watched",
                fontWeight = FontWeight.SemiBold,
                color = TextMain,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "View all",
                    fontSize = 12.sp,
                    color = Primary,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = null,
                    tint = Primary,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            EpisodeCard(
                imageRes = R.drawable.tom_cover,
                iconRes = R.drawable.ic_cheese,
                title = "Number 404 - The Cursed Cheese 🧀"
            )
            EpisodeCard(
                imageRes = R.drawable.tom_cover2,
                iconRes = R.drawable.ic_cheese,
                title = "Chase on the moon 🌕"
            )
        }

        Text(
            text = "Popular character",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = TextMain,
            modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CharacterCard(
                backgroundColor = Color(0xFFFCF2C5),
                name = "Tom",
                description = "Failed stalker",
                imageRes = R.drawable.tom
            )

            CharacterCard(
                backgroundColor = Color(0xFFFCC5E4),
                name = "Jerry",
                description = "A scammer mouse",
                imageRes = R.drawable.jerry

            )
            CharacterCard(
                backgroundColor = Color(0xFFC5E7FC),
                name = "Jerry",
                description = "Hungry mouse",
                imageRes = R.drawable.jerry2

            )
        }
    }
}

@Composable
fun SecretEpisodesHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)

    ) {


        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .align(Alignment.TopStart)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tom_jerry_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(Color(0xFF0085E3), Color(0xFF00497D))
                            )
                        )
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search2),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.width(216.dp)) {
                    Text(
                        text = "Deleted episodes of Tom and Jerry!",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = TextMain
                    )

                    Text(
                        text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = TextMain.copy(50f)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tom_header),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 132.dp, height = 198.dp)
                        .padding(end = 12.dp)
                )
            }
        }


    }
}

@Preview
@Composable
fun SecretEpisodesScreenPreview() {
    SecretEpisodesScreen()
}