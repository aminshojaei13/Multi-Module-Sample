package com.part.userdata.di

import com.part.userdata.api.UserApi
import com.part.userdata.datasource.UserRemoteDataSource
import com.part.userdata.datasource.UserRemoteDataSourceImpl
import com.part.userdata.repositories.UserRepositoryImpl
import com.part.userdomain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
abstract class ConfigModule {

    @Binds
    abstract fun provideUserRepository(repository: UserRepositoryImpl): UserRepository

    /* @Binds
     abstract fun provideUserLocalDataSource(localDataSource: ConfigLocalDataSourceImpl): ConfigLocalDataSource
 */
    @Binds
    abstract fun provideUserRemoteDataSource(dataSource: UserRemoteDataSourceImpl): UserRemoteDataSource

    companion object {
        @Provides
        fun provideApiService(retrofit: Retrofit): UserApi {
            return retrofit.create(UserApi::class.java)
        }
    }
}