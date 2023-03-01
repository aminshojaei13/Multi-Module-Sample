package com.part.user_model

data class Friends(
    val first: String,
    val firstId: Int,
    val second: String?,
    val secondId: Int?,
    val third: String = "amin",
    val thirdId: Int = 22,
)