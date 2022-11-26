package com.part.userdata.datasource

interface UserLocalDataSource {
    suspend fun insertUsers(users: List<com.part.user_model.UserEntity>)
    suspend fun getAllUsers(): List<com.part.user_model.UserEntity>
}