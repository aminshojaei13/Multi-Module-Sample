package com.part.userdomain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val avatar: String,
    val email: String
)
