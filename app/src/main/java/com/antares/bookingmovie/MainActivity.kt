package com.antares.bookingmovie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.antares.bookingmovie.core.route.AppRoute
import com.antares.bookingmovie.ui.theme.BookingMovieTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //from Accompanist, setting a status bar color
            val systemUiController = rememberSystemUiController()
            systemUiController.setStatusBarColor(
                color = Color.Transparent,
                darkIcons = true
            )
            systemUiController.setNavigationBarColor(
                color = Color.Transparent,
                darkIcons = true
            )
            BookingMovieTheme {
                val navController = rememberNavController()
                AppRoute.GenerateRoute(navController = navController)
            }
        }
    }
}

