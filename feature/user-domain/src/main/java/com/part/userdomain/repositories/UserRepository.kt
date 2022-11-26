package com.part.userdomain.repositories

interface UserRepository {
    suspend fun getUsers(): List<com.part.user_model.UserEntity>
}