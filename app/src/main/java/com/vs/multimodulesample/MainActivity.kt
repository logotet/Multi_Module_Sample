package com.vs.multimodulesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.vladi.modulevladi.SendScreen
import com.vs.module_sando.DisplayScreen
import com.vs.multimodulesample.ui.theme.MultiModuleSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleSampleTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "send_screen") {
                    composable("send_screen") {
                        SendScreen(
                            navigateToDisplay = { text ->
                                navController.navigate("display_screen/$text")
                            }
                        )
                    }
                    composable(
                        "display_screen/{text}", arguments = listOf(
                            navArgument("text") {
                                type = androidx.navigation.NavType.Companion.StringType
                            }
                        )
                    ) { entry ->
                        entry.arguments?.getString("text")?.let {
                            DisplayScreen(text = it)
                        }
                    }
                }
            }
        }
    }
}