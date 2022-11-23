package com.part.userdomain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    @SerialName("last_name") val lastName: String,
    @SerialName("first_name") val firstName: String,
    val email: String,
    val avatar: String
) {
    fun toEntity(): UserEntity = UserEntity(
        firstName = firstName,
        lastName = lastName,
        email = email,
        avatar = avatar
    )
}
