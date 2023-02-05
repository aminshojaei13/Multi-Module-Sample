package com.part.userdata.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.part.user_model.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(list: List<UserEntity>)

    @Query("SELECT * FROM user")
    suspend fun getAllUsers(): List<UserEntity>
}