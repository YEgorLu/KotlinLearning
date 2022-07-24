package com.example.sendintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = TextView(this)
        textView.textSize = 20f
        textView.text = message
        textView.gravity = 50

        setContentView(textView)
    }
}