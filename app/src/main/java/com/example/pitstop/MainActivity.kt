package com.example.pitstop

import PitStopTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.example.pitstop.ui.navigation.AppNavHost
import com.example.pitstop.ui.navigation.Screen
import com.example.pitstop.ui.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PitStopTheme {
                val navController = rememberNavController()
                var showSplash by remember { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen { showSplash = false }
                } else {
                    AppNavHost(navController = navController, startDestination = Screen.Login.route)
                }
            }
        }
    }
}

