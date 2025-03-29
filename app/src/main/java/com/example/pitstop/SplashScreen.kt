package com.example.pitstop.ui.screens

import android.window.SplashScreen
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import com.example.pitstop.R
import poppinsFont

@Composable
fun SplashScreen(navigateToHome: () -> Unit) {
    var scale = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(1f, animationSpec = tween(1000))
        delay(500)
        navigateToHome()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.pitstoploadingscreen),
                contentDescription = "App Logo",
                modifier = Modifier
                    .scale(scale.value)
                    .width(250.dp)
                    .height(150.dp)
                    .graphicsLayer(scaleX = -1f)
            )
            Spacer(modifier = Modifier.height(2.dp))

            // Text cu stroke (folosind shadow ca outline)
            Text(
                text = "PitStop",
                fontSize = 56.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFont,
                color = Color(0xFFF8BF40), // Galben
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black, // Outline negru
                        offset = Offset(2f, 2f),
                        blurRadius = 3f // Face conturul mai moale
                        )
                    )
                )
        }
    }
}
