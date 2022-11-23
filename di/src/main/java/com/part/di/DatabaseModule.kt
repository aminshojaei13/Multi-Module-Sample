package com.part.di

import android.content.Context
import androidx.room.Room
import com.part.userdata.db.UserDatabase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DatabaseModule {

    @Binds
    @Singleton
    abstract fun provideUserDatabase(sampleDatabase: SampleDatabase): UserDatabase

    companion object {

        @Provides
        @Singleton
        fun provideDatabase(
            @ApplicationContext context: Context,
        ): SampleDatabase {
            return Room.databaseBuilder(
                context,
                SampleDatabase::class.java,
                "internal.db"
            ).build()
        }
    }
}