package app.christopher.jettrivia.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.christopher.jettrivia.presentation.HomeScreen
import app.christopher.jettrivia.presentation.SplashScreen
import app.christopher.jettrivia.viewmodel.TriviaViewModel

@Composable
fun TriviaNavigation(navController: NavHostController) {

    val triviaViewModel = hiltViewModel<TriviaViewModel>()

    NavHost(navController = navController, startDestination = "splash_screen") {

        composable(route = "splash_screen") {
            SplashScreen(navController, triviaViewModel)
        }
        composable(route = "home_screen") {
            HomeScreen(navController)
        }
    }

}