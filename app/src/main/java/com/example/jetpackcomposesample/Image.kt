package com.example.jetpackcomposesample

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Center
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

@Preview
@Composable
fun test() {
    MaterialTheme {
        Center {
            Container(height = 300.dp, width = 300.dp) {
                DrawImage(image = +imageResource(R.drawable.droidkun))
            }
        }
    }
}