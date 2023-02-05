package com.amin.common_ui

sealed class MultiModuleScreens(val route: String) {
    object User : MultiModuleScreens("user-ui/user")

    object Second : MultiModuleScreens ("second-feature/secondPage?name={name}") {
        fun createRoute(name: String): String {
            return "second-feature/secondPage?name=$name"
        }
    }
}
