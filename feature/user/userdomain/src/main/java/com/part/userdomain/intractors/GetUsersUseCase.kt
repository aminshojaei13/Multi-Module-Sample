package com.part.userdomain.intractors

import com.part.userdomain.model.User
import com.part.userdomain.repositories.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(): List<User> {
        return userRepository.getUsers()
    }
}