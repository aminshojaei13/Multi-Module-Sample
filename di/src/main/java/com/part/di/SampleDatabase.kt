package com.part.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.part.userdata.db.UserDatabase
import com.part.userdomain.model.UserEntity

@Database(
    entities = [
        UserEntity::class
    ],
    version = 1
)
abstract class SampleDatabase : RoomDatabase(), UserDatabase
