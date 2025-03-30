package com.example.pitstop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.R
import poppinsFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewLoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2E7DC)), // Culoare de fundal
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Login here",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppinsFont,
            color = Color(0xFFF8BF40), // Galben
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black, // Outline negru
                    offset = Offset(2f, 2f),
                    blurRadius = 3f // Face conturul mai moale
                )
            ),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome back, you’ve\nbeen missed!",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppinsFont,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Email Input
        OutlinedTextField(
            value = "",
            onValueChange = { },
            placeholder = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFA9411D),
                unfocusedBorderColor = Color(0xFFFFF2D7),
                containerColor = Color(0xFFFFF2D7)
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Password Input
        OutlinedTextField(
            value = "",
            onValueChange = { },
            placeholder = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFA9411D),
                unfocusedBorderColor = Color(0xFFFFF2D7),
                containerColor = Color(0xFFFFF2D7)
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(0.8f).padding(top = 16.dp),
            horizontalArrangement = Arrangement.End // Aliniază textul la dreapta
        ) {

            Text(
                text = "Forgot your password?",
                fontFamily = poppinsFont,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Buton Sign In
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp)
                .shadow(elevation = 54.dp, shape = RoundedCornerShape(8.dp)), // Adaugă umbră manual,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA9411D))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(), // Asigură-te că Row-ul ocupă tot spațiul butonului
                horizontalArrangement = Arrangement.Center, // Aliniază textul la centru pe orizontală
                verticalAlignment = Alignment.CenterVertically // Aliniază textul la centru pe verticală
            ) {
                Text(
                    text = "Sing in",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = poppinsFont
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Buton Create Account
        Button(
            onClick = { /* Navighează spre ecranul de înregistrare */ },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(30.dp)
                .shadow(elevation = 54.dp, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFF2D7))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(), // Asigură-te că Row-ul ocupă tot spațiul butonului
                horizontalArrangement = Arrangement.Center, // Aliniază textul la centru pe orizontală
                verticalAlignment = Alignment.CenterVertically // Aliniază textul la centru pe verticală
            ) {
                Text(
                    text = "Create new account",
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontFamily = poppinsFont,
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Or continue with",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Icone Social Media
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.pitstoploadingscreen),
                contentDescription = "Google",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pitstoploadingscreen),
                contentDescription = "Facebook",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pitstoploadingscreen),
                contentDescription = "Apple",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
