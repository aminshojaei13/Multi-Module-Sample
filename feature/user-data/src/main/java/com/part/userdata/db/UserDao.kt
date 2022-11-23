package com.part.userdata.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.part.userdomain.model.UserEntity

@Dao
interface UserDao {

    @Insert
    suspend fun insertUsers(list: List<UserEntity>)

    @Query("SELECT * FROM user")
    suspend fun getAllUsers(): List<UserEntity>
}