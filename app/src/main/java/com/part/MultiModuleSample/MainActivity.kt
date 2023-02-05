package com.part.MultiModuleSample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.part.MultiModuleSample.ui.theme.MultiModuleSampleTheme
import com.part.ui.secondNavGraph
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.dependency
import com.ramcosta.composedestinations.scope.DestinationScope
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DestinationsNavHost(
                        navGraph = MainNavGraphs,
                        dependenciesContainerBuilder = {
                            dependency(AppNavigator(navController))
                        }
                    )
                }
            }
        }
    }
}

fun DestinationScope<*>.currentNavigator(navigator: NavController): AppNavigator {
    return AppNavigator(navigator)
}