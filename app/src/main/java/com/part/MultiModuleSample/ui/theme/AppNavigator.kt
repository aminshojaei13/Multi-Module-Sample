package com.part.MultiModuleSample.ui.theme

import androidx.navigation.NavController
import com.part.ui.SecondFeatureNavigator
import com.part.ui.UserUiNavigator
import com.part.ui.destinations.MidPageDestination
import com.part.ui.destinations.SecondPageDestination
import com.part.user_model.Diamond
import com.part.user_model.Friends
import com.ramcosta.composedestinations.navigation.navigate

class AppNavigator(private val navController: NavController) : UserUiNavigator,
    SecondFeatureNavigator {
    override fun navigateUp() {
        navController.navigateUp()
    }

    override fun openMidScreen(name: Diamond, duration: Int, leader: String) {
        navController.navigate(MidPageDestination(name, duration, leader))
    }

    override fun openSecond(friends: Friends) {
        navController.navigate(SecondPageDestination.route)
    }
}