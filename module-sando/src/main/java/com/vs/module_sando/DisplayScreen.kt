package com.vs.module_sando

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

@OptIn(ExperimentalUnitApi::class)
@Composable
fun DisplayScreen(text: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = text,
            fontSize = TextUnit(value = 15f, type = TextUnitType.Sp),
            color = Color.Black
        )
    }
}

@Preview
@Composable
fun DisplayScreenPreview() {
    MaterialTheme {
        DisplayScreen(
            text = "Placeholder"
        )
    }
}