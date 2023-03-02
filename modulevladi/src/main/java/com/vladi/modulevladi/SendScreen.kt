package com.vladi.modulevladi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SendScreen(navigateToDisplay: (String) -> Unit) {
    SendScreenContent(navigate = navigateToDisplay)
}

@Composable
fun SendScreenContent(
    navigate: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { newValue -> text = newValue }
        )

        Button(onClick = { navigate(text) }) {
            Text(text = "Display!")
        }
    }
}
