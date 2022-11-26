package com.part.userdomain.intractors

import com.part.userdomain.repositories.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(): List<com.part.user_model.UserEntity> {
        return userRepository.getUsers()
    }
}