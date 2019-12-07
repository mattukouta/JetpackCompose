package com.example.jetpackcomposesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.Composable
import androidx.compose.Context
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Row
import androidx.ui.material.Divider
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { test(this) }
    }
}
val fruitList = arrayOf("りんご", "いちご", "みかん", "なし", "パイナップル", "スイカ", "メロン", "さくらんぼ", "バナナ", "キウイ", "ぶどう", "レモン")

@Composable
fun test(context: Context) {
    MaterialTheme {
        HorizontalScroller {
            Row {
                for (fruit in fruitList) {
                    ListItem(
                        text = fruit,
                        onClick = {
                            Toast.makeText(context, fruit, Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            }
        }

    }
}
