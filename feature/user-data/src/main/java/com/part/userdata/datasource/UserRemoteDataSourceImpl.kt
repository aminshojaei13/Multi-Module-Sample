package com.part.userdata.datasource

import com.part.userdata.api.UserApi
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    private val userApi: UserApi
) : UserRemoteDataSource {
    override suspend fun getUser(): List<com.part.user_model.UserResponse> {
        val users = userApi.getUsers()
        return if (users.isSuccessful) {
            users.body()!!.data
        } else {
            throw Exception(users.errorBody().toString())
        }
    }
}