package com.part.ui.midpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.part.ui.SecondFeatureNavigator
import com.part.user_model.Diamond
import com.part.user_model.Friends
import com.ramcosta.composedestinations.annotation.Destination


@OptIn(ExperimentalMaterial3Api::class)
@Destination
@Composable
fun MidPage(
    secondFeatureNavigator: SecondFeatureNavigator,
    //viewModel: MidViewModel = hiltViewModel(),
    data: Diamond,
    friends: Friends,
    duration: Int,
    leader:String
) {
    val viewModel :MidViewModel by hiltViewModel()


    val state  by viewModel.state.collectAsState()

    Scaffold { paddingValues ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item {
                Text(text = "Hi from ${data.name} - ${data.age}")
            }
            item {
                Button(onClick = { secondFeatureNavigator.openSecond(friends) }) {
                    Text(text = "go to next page")
                }
            }

        }
    }
}




