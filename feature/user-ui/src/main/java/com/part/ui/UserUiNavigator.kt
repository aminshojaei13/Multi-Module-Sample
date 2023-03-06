package com.part.ui

import com.part.user_model.Diamond

interface UserUiNavigator {
    fun openMidScreen(name: Diamond, duration: Int, leader: String)
}