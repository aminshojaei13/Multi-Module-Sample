package com.part.userdata.db

interface UserDatabase {
    fun getUserDao(): UserDao
}