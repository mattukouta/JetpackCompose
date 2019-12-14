package com.example.jetpackcomposesample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import com.example.jetpackcomposesample.ui.createEditTextUI

class EditTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { createEditTextUI() }
    }
}
