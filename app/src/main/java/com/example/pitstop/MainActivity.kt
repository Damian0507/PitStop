package com.example.pitstop

import PitStopTheme
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.pitstop.ui.screens.LoginScreen
import com.example.pitstop.ui.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // @Suppress("InlinedApi")
            //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

            PitStopTheme { // Aplicăm tema aici
                var showSplash by remember { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen { showSplash = false }
                } else {
                    LoginScreen()
                }
            }
        }
    }
}

