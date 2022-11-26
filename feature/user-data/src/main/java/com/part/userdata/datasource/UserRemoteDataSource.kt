package com.part.userdata.datasource

interface UserRemoteDataSource {
    suspend fun getUser(): List<com.part.user_model.UserResponse>
}