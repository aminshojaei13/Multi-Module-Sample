package com.part.userdomain.repositories

import com.part.userdomain.model.UserEntity

interface UserRepository {
    suspend fun getUsers(): List<UserEntity>
}