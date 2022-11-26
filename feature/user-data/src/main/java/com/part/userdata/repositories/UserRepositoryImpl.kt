package com.part.userdata.repositories

import com.part.userdata.datasource.UserLocalDataSource
import com.part.userdata.datasource.UserRemoteDataSource
import com.part.userdomain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userRemoteDataSource: UserRemoteDataSource,
    private val userLocalDataSource: UserLocalDataSource
) : UserRepository {
    override suspend fun getUsers(): List<com.part.user_model.UserEntity> {
        val user = userRemoteDataSource.getUser()
        userLocalDataSource.insertUsers(user.map { it.toEntity() })
        return userLocalDataSource.getAllUsers()

    }
}