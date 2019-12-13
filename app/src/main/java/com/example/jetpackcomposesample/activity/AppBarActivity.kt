package com.example.jetpackcomposesample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import com.example.jetpackcomposesample.ui.createAppBarUI

class AppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { createAppBarUI() }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun backActivity() {
        finish()
    }
}
