package com.example.jetpackcomposesample.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import com.example.jetpackcomposesample.ui.createMainUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            createMainUI(this)
        }
    }

    fun moveActivity(clazz: Class<*>) {
        val intent = Intent(this@MainActivity, clazz)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}

