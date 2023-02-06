package com.part.MultiModuleSample.ui.theme

import androidx.navigation.NavController
import com.part.ui.UserUiNavigator
import com.part.ui.destinations.SecondPageDestination
import com.ramcosta.composedestinations.navigation.navigate

class AppNavigator(private val navController: NavController): UserUiNavigator {
    override fun openSecond(text: String) {
        navController.navigate(SecondPageDestination)
    }
}