package com.part.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//data class Friends()

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowMidPage(
    friends:String = "saeed"
) {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item() {
                Text(text = "Hi from $friends")
            }
        }
    }
}