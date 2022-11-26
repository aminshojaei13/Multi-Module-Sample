package com.part.userdomain.repositories

import com.part.user_model.UserEntity

interface UserRepository {
    suspend fun getUsers(): List<UserEntity>
}