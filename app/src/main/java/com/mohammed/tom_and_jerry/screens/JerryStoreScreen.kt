package com.mohammed.tom_and_jerry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.composable.AdBanner
import com.mohammed.tom_and_jerry.composable.CustomAppBar
import com.mohammed.tom_and_jerry.composable.ProductCard
import com.mohammed.tom_and_jerry.composable.SearchWithFilterBar
import com.mohammed.tom_and_jerry.ui.theme.Background
import com.mohammed.tom_and_jerry.ui.theme.Primary
import com.mohammed.tom_and_jerry.ui.theme.TextMain

import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.mohammed.tom_and_jerry.R

@Composable
fun JerryStoreScreen() {
    Scaffold(
        containerColor = Background,
        contentColor = TextMain,
        modifier = Modifier.background(Background)
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Background)
                .statusBarsPadding()
        ) {
            CustomAppBar()

            Spacer(modifier = Modifier.height(8.dp))

            SearchWithFilterBar()

            Spacer(modifier = Modifier.height(12.dp))

            AdBanner()

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cheap tom section",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = TextMain
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

            Spacer(modifier = Modifier.height(8.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(tomList.size) { index ->
                    val tom = tomList[index]
                    ProductCard(
                        title = tom.first,
                        description = tom.second,
                        originalPrice = tom.third.first,
                        salePrice = tom.third.second,
                        imageRes = tomImages.getOrElse(index) { R.drawable.tom1 }
                    )
                }
            }
        }
    }
}

val tomList = listOf(
    Triple(
        "Sport Tom",
        "He runs 1 meter... trips over his boot.",
        Pair("5", "3"),

        ),
    Triple(
        "Tom the lover",
        "He loves one-sidedly... and is beaten by the other side.",
        Pair("", "5")
    ),
    Triple(
        "Tom the bomb",
        "He blows himself up before Jerry can catch him.",
        Pair("", "10")
    ),
    Triple(
        "Spy Tom",
        "Disguises itself as a table.",
        Pair("", "12")
    ),
    Triple(
        "Frozen Tom",
        "He was chasing Jerry, he froze after the first look.",
        Pair("", "10")
    ),
    Triple(
        "Sleeping Tom",
        "He doesn’t chase anyone, he just snores in stereo.",
        Pair("", "10")
    )
)
val tomImages = listOf(
    R.drawable.tom1,
    R.drawable.tom2,
    R.drawable.tom3,
    R.drawable.tom4,
    R.drawable.tom5,
    R.drawable.tom6,

    )

@Preview(showBackground = true)
@Composable
fun Screen() {
    JerryStoreScreen()
}