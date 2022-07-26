package com.example.sportapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport)

        val sportId = intent.extras?.get(EXTRA_SPORT) as Int
        val sport = Sport.sports[sportId]

        val imageView = findViewById<ImageView>(R.id.image)
        imageView.setImageResource(sport.imageResourceId)
        imageView.contentDescription = sport.name

        val textView = findViewById<TextView>(R.id.name)
        textView.text = sport.name

        val descriptor = findViewById<TextView>(R.id.description)
        descriptor.text = sport.descriptor
    }

    companion object {
        const val EXTRA_SPORT = "sportId"
    }
}