package com.part.userdata.datasource

import com.part.user_model.UserEntity

interface UserLocalDataSource {
    suspend fun insertUsers(users: List<UserEntity>)
    suspend fun getAllUsers(): List<UserEntity>
}