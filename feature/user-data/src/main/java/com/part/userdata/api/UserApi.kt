package com.part.userdata.api

import com.part.user_model.UsersResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("api/users?page=2")
    suspend fun getUsers(): Response<UsersResponse>
}