package com.part.userdomain.model

import kotlinx.serialization.Serializable

@Serializable
data class UsersResponse(
    val data: List<User>
)
