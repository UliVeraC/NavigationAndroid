package com.example.navigator

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigator.Screens.HomeScreen
import com.example.navigator.Screens.SecondScreen
import com.example.navigator.Screens.ContactScreen

@Composable
fun NavigatorHostController() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreensClass.HomeScreensClass.name,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(500)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(500)
            )
        }
    ) {
        composable(route = ScreensClass.HomeScreensClass.name) { HomeScreen(navController) }
        composable(route = ScreensClass.AddScreensClass.name) { SecondScreen(navController) }
        composable(
            route = "${ScreensClass.ContactScreen.name}/{userName}",
            arguments = listOf(navArgument("userName"){
                type = NavType.StringType
            })
        ) {

            val userName = it.arguments?.getString("userName")

            ContactScreen(navController, userName)
        }
    }
}