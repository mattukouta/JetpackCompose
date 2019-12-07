package com.example.jetpackcomposesample

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

@Preview("Greeting")
@Composable
fun greeting() {
    greetingView("jetpackCompose")
}

@Composable
fun greetingView(name: String) {
    MaterialTheme {
        Center {
            Text(text = "Hello $name!")
        }
    }
}