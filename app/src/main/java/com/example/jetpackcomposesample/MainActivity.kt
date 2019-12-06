package com.example.jetpackcomposesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.material.Colors
import androidx.ui.material.MaterialColors
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeColor
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            greeting()
        }
    }
}

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
