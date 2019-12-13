package com.example.jetpackcomposesample.ui

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcomposesample.originalTextViewStyle

@Preview("Greeting")
@Composable
fun createGreetingUI() {
    greetingView("JetpackCompose")
}

@Composable
fun greetingView(name: String) {
    MaterialTheme {
        Center {
            Text(text = "Hello $name!", style = originalTextViewStyle())
        }
    }
}