package com.example.jetpackcomposesample.ui

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

@Preview("Greeting")
@Composable
fun createGreetingUI() {
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