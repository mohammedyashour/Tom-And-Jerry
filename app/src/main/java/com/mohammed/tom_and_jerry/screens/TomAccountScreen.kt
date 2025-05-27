package com.mohammed.tom_and_jerry.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.R
import com.mohammed.tom_and_jerry.composable.StatCard
import com.mohammed.tom_and_jerry.ui.theme.Background
import com.mohammed.tom_and_jerry.ui.theme.TextMain

@Composable
fun TomAccountScreen() {
    Scaffold(
        containerColor = Background,
        contentColor = TextMain
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.account_background),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tom_profile),
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(RoundedCornerShape(12))
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Tom", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(
                        "specializes in failure!",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .background(Color.White.copy(alpha = 0.12f))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            "Edit foolishness",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .offset(y = (-48).dp)
                    .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                    .background(Background)
                    .padding(start = 16.dp, end = 16.dp, top = 32.dp, bottom = 0.dp),

                ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)

                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        
                    ) {
                        StatCard(
                            value = "2M 12K",
                            label = "No. of quarrels",
                            backgroundColor = Color(0xFFD0E5F0),
                            iconRes = R.drawable.ic_cat,
                            iconColor = Color(0xFF075174),
                            percentage = 0.6f
                        )
                        StatCard(
                            value = "+500 h",
                            label = "Chase time",
                            backgroundColor = Color(0xFFDEEECD),
                            iconRes = R.drawable.ic_run,
                            iconColor = Color(0xFF57AB0F),
                            percentage = 0.25f
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        StatCard(
                            value = "2M 12K",
                            label = "Hunting times",
                            backgroundColor = Color(0xFFF2D9E7),
                            iconRes = R.drawable.ic_sad,
                            iconColor = Color(0xFFF46983),
                            percentage = 0.15f
                        )
                        StatCard(
                            value = "3M 7K",
                            label = "Heartbroken",
                            backgroundColor = Color(0xFFFAEDCF),
                            iconRes = R.drawable.ic_borken_heart,
                            iconColor = Color(0xFFFFBF1A),
                            percentage = 0.9f
                        )

                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    "Tom settings",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xDE1F1F1E),
                )
                Spacer(modifier = Modifier.height(8.dp))
                SettingsItem(R.drawable.ic_bed, "Change sleeping place")
                SettingsItem(R.drawable.ic_cat, "Meow settings")
                SettingsItem(R.drawable.ic_lock, "Password to open the fridge")

                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    "His favorite foods",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xDE1F1F1E)
                )

                Spacer(modifier = Modifier.height(8.dp))
                SettingsItem(R.drawable.ic_alert, "Mouses")
                SettingsItem(R.drawable.ic_food, "Last stolen meal")
                SettingsItem(R.drawable.ic_mood, "Change sleep mood")
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text("v.TomBeta", color = Color.Gray, fontSize = 12.sp)
                }


            }
        }
    }
}


@Composable
fun SettingsItem(icon: Int, label: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color(0xFF1F1F1E)
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = label,
            fontSize = 14.sp,
            color = Color(0xFF1F1F1E),
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen()
}
