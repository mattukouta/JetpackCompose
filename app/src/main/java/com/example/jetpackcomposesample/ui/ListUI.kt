package com.example.jetpackcomposesample.ui

import android.widget.Toast
import androidx.compose.Composable
import androidx.compose.Context
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.material.Divider
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme

@Composable
fun createListUI(context: Context) {

    val fruitList = arrayOf("りんご", "いちご", "みかん", "なし", "パイナップル", "スイカ", "メロン", "さくらんぼ", "バナナ", "キウイ", "ぶどう", "レモン", "グレープフルーツ", "モモ", "ゆず")

    MaterialTheme {
        FlexColumn {
            flexible(flex = 1f) {
                VerticalScroller {
                    Column {
                        for (fruit in fruitList) {
                            ListItem(
                                text = fruit,
                                onClick = {
                                    Toast.makeText(context, fruit, Toast.LENGTH_SHORT).show()
                                }
                            )
                            /**
                             * 区切り線の表示
                             */
                            /**
                             * 区切り線の表示
                             */
                            Divider(color = Color(0x44666666))
                        }
                    }
                }
            }
        }
    }
}
