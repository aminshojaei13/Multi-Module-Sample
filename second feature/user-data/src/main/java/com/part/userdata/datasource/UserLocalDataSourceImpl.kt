package com.part.userdata.datasource

import com.part.user_model.UserEntity
import com.part.userdata.db.UserDao
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    private val userDao: UserDao
) : UserLocalDataSource {
    override suspend fun insertUsers(users: List<UserEntity>) {
        userDao.insertUsers(users)
    }

    override suspend fun getAllUsers(): List<UserEntity> {
        return userDao.getAllUsers()
    }
}