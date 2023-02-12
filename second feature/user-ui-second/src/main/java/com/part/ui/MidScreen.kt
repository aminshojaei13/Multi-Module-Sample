package com.part.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.part.user_model.Diamond
import com.ramcosta.composedestinations.annotation.Destination
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


@OptIn(ExperimentalMaterial3Api::class)
@Destination
@Composable
fun MidPage(
    navController: NavController,
    data: Diamond
) {

    Scaffold { paddingValues ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item() {
                Text(text = "Hi from ${data.name} + ${data.age}")
            }
        }
    }
}

class Foo(
    savedStateHandle: SavedStateHandle
):ViewModel(){
    val a = savedStateHandle.navArgs<Diamond>()
}