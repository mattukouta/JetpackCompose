package com.example.jetpackcomposesample

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.tooling.preview.Preview

//    @Preview("Greeting")
//    @Composable
//    fun greeting() {
//        greetingView(name = "kotlin")
//    }
//
//    @Composable
//    fun greetingView(name: String) {
//        var count = +state { 0 }
//        MaterialTheme {
//            Center {
//                Text(text = "Hello $name!")
//            }
//            Column(crossAxisSize = LayoutSize.Wrap) {
//                Text(text = "Hello $name!")
//
//                HeightSpacer(16.dp)
//
//                Text(text = "hoge")
//
//                HeightSpacer(16.dp)
//
//                Button(onClick = { count.value++ }, text = "count up")
//
//                HeightSpacer(16.dp)
//
//                Text(text = count.value.toString())
//            }
//        }
//    }
