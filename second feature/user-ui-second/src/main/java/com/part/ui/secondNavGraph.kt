package com.part.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.amin.common_ui.MultiModuleScreens


fun NavGraphBuilder.secondNavGraph(navController: NavController) {
    navigation(startDestination = MultiModuleScreens.User.route, route ="second-ui") {
        composable(
            route = MultiModuleScreens.Second.route,
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                }
            )
        ) {
            SecondPage(
                navController = navController
            )
        }
    }
}