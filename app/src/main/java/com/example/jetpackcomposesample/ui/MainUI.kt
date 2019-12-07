package com.example.jetpackcomposesample.ui

import androidx.compose.Composable
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import com.example.jetpackcomposesample.MainListButtonStyle
import com.example.jetpackcomposesample.activity.GreetingActivity
import com.example.jetpackcomposesample.activity.ImageActivity
import com.example.jetpackcomposesample.activity.ListViewActivity
import com.example.jetpackcomposesample.activity.MainActivity

@Composable
fun createMainUI(view: MainActivity) {
    MaterialTheme {
        Column {
            /**
             * ボタン作成
             */
            Button(onClick = { view.moveActivity(GreetingActivity::class.java) }, style = MainListButtonStyle(), text = "Greeting")

            Divider(color = Color(0x44666666))

            Button(onClick = { view.moveActivity(ListViewActivity::class.java) }, style = MainListButtonStyle(), text = "List")

            Divider(color = Color(0x44666666))

            Button(onClick = { view.moveActivity(ImageActivity::class.java) }, style = MainListButtonStyle(), text = "Image")

        }
    }
}

