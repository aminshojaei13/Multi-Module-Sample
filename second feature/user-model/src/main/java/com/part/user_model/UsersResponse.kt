package com.part.user_model

import kotlinx.serialization.Serializable

@Serializable
data class UsersResponse(
    val data: List<UserResponse>
)
