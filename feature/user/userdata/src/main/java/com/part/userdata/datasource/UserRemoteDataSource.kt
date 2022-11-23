package com.part.userdata.datasource

import com.part.userdomain.model.User

interface UserRemoteDataSource {
    suspend fun getUser(): List<User>
}