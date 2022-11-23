package com.part.ui

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.userNavGraph(navController: NavController) {
    navigation("user", "navGraph") {
        composable("user") {
            UserScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }
    }
}