package com.part.ui

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.amin.common_ui.MultiModuleScreens


fun NavGraphBuilder.userNavGraph(navController: NavController) {
    navigation(startDestination = MultiModuleScreens.User.route, route ="user-ui") {
        composable(MultiModuleScreens.User.route) {
            UserScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }
    }
}