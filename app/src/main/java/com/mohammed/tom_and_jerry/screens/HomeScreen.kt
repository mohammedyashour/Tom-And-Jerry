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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(8.dp)
    ) {
        AdBanner()


    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}