package com.part.ui

import com.part.user_model.Friends

interface SecondFeatureNavigator {
    fun navigateUp()
    fun openSecond(friends: Friends)
}