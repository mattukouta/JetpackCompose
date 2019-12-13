package com.example.jetpackcomposesample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.ui.core.setContent
import com.example.jetpackcomposesample.ui.createGreetingUI

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        title = "GreetingView"
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContent {
            createGreetingUI()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                overridePendingTransition(0, 0)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}