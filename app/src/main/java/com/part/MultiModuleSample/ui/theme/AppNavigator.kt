package com.part.MultiModuleSample.ui.theme

import androidx.navigation.NavController
import com.part.ui.SecondFeatureNavigator
import com.part.ui.UserUiNavigator
import com.part.ui.destinations.MidPageDestination
import com.part.ui.destinations.SecondPageDestination
import com.ramcosta.composedestinations.navigation.navigate

class AppNavigator(private val navController: NavController) : UserUiNavigator,
    SecondFeatureNavigator {
    override fun openSecond(text: String) {
        navController.navigate(SecondPageDestination.route)
    }

    override fun openMidScreen(name: String) {
        navController.navigate(MidPageDestination(name))
    }
}