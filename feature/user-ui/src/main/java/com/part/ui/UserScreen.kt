package com.part.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.part.user_model.Diamond
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@OptIn(ExperimentalMaterial3Api::class)
@RootNavGraph(start = true)
@Destination(style = SnapFadeAnim::class)
@Composable
fun UserScreen(
    userUiNavigator: UserUiNavigator,
) {

    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item {
                Text(text = "Hi amin shojaei")
            }
            item {
                Button(onClick = {
                    userUiNavigator.openMidScreen(
                        name = Diamond("amin", 20),
                        duration = 10,
                        leader = "ali"
                    )
                }) {
                    Text(text = "go to next page")
                }
            }
        }
    }
}