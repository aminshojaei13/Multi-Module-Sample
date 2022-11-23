package com.part.userdomain.repositories

import com.part.userdomain.model.User

interface UserRepository {
    suspend fun getUsers(): List<User>
}