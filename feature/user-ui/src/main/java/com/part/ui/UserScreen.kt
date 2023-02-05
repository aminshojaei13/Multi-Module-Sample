package com.part.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.amin.common_ui.MultiModuleScreens
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph


@OptIn(ExperimentalMaterial3Api::class)
@RootNavGraph(start = true) // sets this as the start destination of the default nav graph
@Destination
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
                Button(onClick = { userUiNavigator.openSecond("amin and mohsen") }) {
                    Text(text = "go to next page")
                }
            }

            item {
                Button(onClick = {navController.navigate(MultiModuleScreens.Second.createRoute("amin"))}) {
                    Text(text = "second page")
                }
            }
        }
    }
}