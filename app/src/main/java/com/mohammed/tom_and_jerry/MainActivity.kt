package com.mohammed.tom_and_jerry

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import com.mohammed.tom_and_jerry.screens.JerryStoreScreen
import com.mohammed.tom_and_jerry.screens.SecretEpisodesScreen
import com.mohammed.tom_and_jerry.screens.TomAccountScreen
import com.mohammed.tom_and_jerry.screens.TomKitchenScreen
import com.mohammed.tom_and_jerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomAndJerryTheme {
                //JerryStoreScreen()
                //TomAccountScreen()
                SecretEpisodesScreen()
                //TomKitchenScreen()
            }
        }
    }
}

