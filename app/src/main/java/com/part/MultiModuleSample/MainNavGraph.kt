package com.part.MultiModuleSample

import com.part.ui.SecondfeatureNavGraph
import com.part.ui.UserUiNavGraph
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object MainNavGraph {
    val root = object: NavGraphSpec {
        override val route = "root"
        override val startRoute = UserUiNavGraph
        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()
        override val nestedNavGraphs = listOf(
            UserUiNavGraph,
            SecondfeatureNavGraph
        )
    }
}