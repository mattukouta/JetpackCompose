package com.example.jetpackcomposesample.ui

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.graphics.Color
import androidx.ui.input.EditorStyle
import androidx.ui.input.KeyboardType
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextRange
import androidx.ui.text.TextStyle

@Composable
fun createEditTextUI() {
    val state = +state { "" }
    TextField(
        value = state.value,
        onValueChange = { state.value = it },
        editorStyle = EditorStyle(
            textStyle = TextStyle(
                fontSize = (20.sp)
            )
        ),
        keyboardType = KeyboardType.NumberPassword
    )
}