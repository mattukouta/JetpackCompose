package com.example.jetpackcomposesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.ui.core.setContent

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { createList(this@ListViewActivity) }
    }
}
