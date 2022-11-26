package com.part.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.part.user_model.UserEntity
import com.part.userdata.db.UserDatabase

@Database(
    entities = [
        UserEntity::class
    ],
    version = 1
)
abstract class SampleDatabase : RoomDatabase(), UserDatabase
