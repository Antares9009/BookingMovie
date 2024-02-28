package com.antares.bookingmovie.core.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.antares.bookingmovie.ui.detail.presentation.DetailScreen
import com.antares.bookingmovie.ui.home.model.nowPlayingMovie
import com.antares.bookingmovie.ui.home.presentation.HomeScreen
import com.antares.bookingmovie.ui.seat_selector.presentation.SeatSelectorScreen

object AppRoute {

    @Composable
    fun GenerateRoute(navController: NavHostController){
        NavHost(
            navController = navController,
            startDestination = AppRouteName.Home
        ) {
            composable(AppRouteName.Home) {
                HomeScreen(navController = navController)
            }
            composable("${AppRouteName.Detail}/{movieId}") { backStackEntry ->
                val id = backStackEntry.arguments?.getString("movieId")
                val movie = nowPlayingMovie.first{ it.id == id }

                DetailScreen(navController = navController, movie)
            }
            composable(AppRouteName.SeatSelector){
                SeatSelectorScreen(navController = navController)
            }
        }
    }
}