package com.example.jetpackcomposesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.core.sp
import androidx.ui.engine.geometry.Shape
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.material.*
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    /**
                     * ボタン作成
                     */
                    Button(onClick = { moveActivity(GreetingActivity::class.java) }, style = MainListButtonStyle(), text = "Greeting")

                    Divider(color = Color(0x44666666))

                    Button(onClick = { moveActivity(ListViewActivity::class.java) }, style = MainListButtonStyle(), text = "List")

                    Divider(color = Color(0x44666666))

                    Button(onClick = { moveActivity(ImageActivity::class.java) }, style = MainListButtonStyle(), text = "Image")
                }
            }
        }
    }

    fun moveActivity(clazz: Class<*>) {
        val intent = Intent(this@MainActivity, clazz)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}

