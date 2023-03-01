package com.part.ui.midpage

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.part.ui.navArgs
import com.part.user_model.Friends
import kotlinx.coroutines.flow.MutableStateFlow

class MidViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    val friends = savedStateHandle.navArgs<Friends>()
    val state = MutableStateFlow(MidState())
}