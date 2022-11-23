package com.part.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.part.userdomain.intractors.GetUsersUseCase
import com.part.userdomain.model.UserEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase,
) : ViewModel() {

    val usersFlow = MutableStateFlow<List<UserEntity>>(listOf())

    init {
        viewModelScope.launch {
            usersFlow.value = getUsersUseCase()
        }
    }
}