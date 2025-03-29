package com.example.pitstop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.R
import poppinsFont

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
            //.background(colorResource(id = R.color.background)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize() // Ocupă întreaga dimensiune a ecranului
                .padding(top = 74.dp), // Adaugă puțin spațiu deasupra dacă este nevoie
            horizontalAlignment = Alignment.CenterHorizontally, // Centrează orizontal conținutul
            verticalArrangement = Arrangement.Top // Aliniază conținutul în partea de sus
        ) {
            Image(
                painter = painterResource(id = R.drawable.pitstoploadingscreen),
                contentDescription = "App Logo",
                modifier = Modifier
                    .width(250.dp)
                    .height(150.dp)
                    .align(Alignment.CenterHorizontally) // Centrează imaginea în Column
                    .graphicsLayer(scaleX = -1f)
            )

            // Text cu stroke (folosind shadow ca outline)
            androidx.compose.material3.Text(
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

            Spacer(modifier = Modifier.height(46.dp))

            Text(
                text = "Road problems?\nWe've got you covered!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFont, // Dacă ai un font personalizat, înlocuiește aici
                color = Color(0xFFF8BF40), // Galben
                textAlign = TextAlign.Center, // Aliniere la centru
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black, // Contur negru
                        offset = Offset(2f, 2f),
                        blurRadius = 3f
                    )
                ),
                modifier = Modifier.fillMaxWidth() // Face ca textul să ocupe toată lățimea și să fie centrat
            )

            Spacer(modifier = Modifier.height(50.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween // Distribuie butoanele echilibrat
            )
            {
                Button(
                    onClick = { /* Navighează spre HomeScreen() */ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFA9411D)),
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .shadow(elevation = 54.dp, shape = RoundedCornerShape(8.dp)) // Adaugă umbră manual
                ) {
                    Text("Login", color = Color.White, fontSize = 18.sp, fontFamily = poppinsFont)
                }

                Spacer(modifier = Modifier.width(24.dp)) // Distanță între butoane

                Button(
                    onClick = { /* Navighează spre RegisterScreen() */ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFF2D7)),
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .shadow(elevation = 54.dp, shape = RoundedCornerShape(8.dp)) // Adaugă umbră manual
                ) {
                    Text("Register", color = Color.Black, fontSize = 18.sp, fontFamily = poppinsFont)
            }

            }
        }
    }
}
