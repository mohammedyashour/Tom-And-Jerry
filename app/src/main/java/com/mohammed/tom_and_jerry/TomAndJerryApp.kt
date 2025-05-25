package com.mohammed.tom_and_jerry

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

import com.mohammed.tom_and_jerry.screens.HomeScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TomAndJerryApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Tom And Jerry")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                // TODO: Add action
            }) {
                Text("+")
            }
        }
    ) {
        Text("main")
        HomeScreen()
    }
}