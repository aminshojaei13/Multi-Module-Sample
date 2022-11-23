package com.part.userdata.repositories

import com.part.userdata.datasource.UserRemoteDataSource
import com.part.userdomain.model.User
import com.part.userdomain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userRemoteDataSource: UserRemoteDataSource
) : UserRepository {
    override suspend fun getUsers(): List<User> {
        return userRemoteDataSource.getUser()
    }
}