package com.example.jetpackcomposesample.ui

import android.app.Activity
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.Context
import androidx.compose.unaryPlus
import androidx.ui.core.ConfigurationAmbient
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.WithDensity
import androidx.ui.foundation.Clickable
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.material.*
import androidx.ui.material.ripple.Ripple
import androidx.ui.res.vectorResource
import com.example.jetpackcomposesample.R
import com.example.jetpackcomposesample.originalAppBarTextStyle


@Composable
fun createAppBarUI() {
    MaterialTheme {
        Column(mainAxisAlignment = MainAxisAlignment.Start) {
            TopAppBar(
                title = { Text(text = "cuntomAppBar", style = originalAppBarTextStyle()) },
                color =  Color(0xFF339933),
                navigationIcon = {
                    VectorImageButton(R.drawable.ic_home) { Log.d("check", "Clicked home") }
                }
            )
        }
    }
}

@Composable
fun VectorImageButton(@DrawableRes id: Int, onClick: () -> Unit) {
    Ripple(bounded = false) {
        Clickable(onClick = onClick) {
            VectorImage(id)
        }
    }
}

@Composable
fun VectorImage(@DrawableRes id: Int, tint: Color = Color.Transparent) {
    val vector = +vectorResource(id)
    WithDensity {
        Container(
            width = vector.defaultWidth.toDp(),
            height = vector.defaultHeight.toDp()
        ) {
            DrawVector(vector, tint)
        }
    }
}