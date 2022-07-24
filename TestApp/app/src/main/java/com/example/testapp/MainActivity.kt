package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yesButton: Button = findViewById(R.id.button_yes)
        val noButton: Button = findViewById(R.id.button_no)
        yesButton.setOnClickListener {
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_LONG).show()
        }

        noButton.setOnClickListener {
            Toast.makeText(this, R.string.incorrect_answer, Toast.LENGTH_LONG).show()
        }
    }
}