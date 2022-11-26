package com.part.userdata.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(list: List<com.part.user_model.UserEntity>)

    @Query("SELECT * FROM user")
    suspend fun getAllUsers(): List<com.part.user_model.UserEntity>
}