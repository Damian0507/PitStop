package com.example.pitstop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pitstop.ui.screens.LoginScreen
import com.example.pitstop.ui.screens.NewLoginScreen
import com.example.pitstop.ui.screens.SplashScreen

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Login : Screen("login_screen")
    object NewLogin : Screen("new_login_screen")
}

@Composable
fun AppNavHost(navController: NavHostController, startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {

        composable(Screen.Splash.route) {
            SplashScreen {
                navController.navigate(Screen.Login.route) {
                    popUpTo(Screen.Splash.route) { inclusive = true }
                }
            }
        }

        composable(Screen.Login.route) {
            LoginScreen(onLoginClick = {
                navController.navigate(Screen.NewLogin.route)
            })
        }

        composable(Screen.NewLogin.route) {
            NewLoginScreen()
        }
    }
}
