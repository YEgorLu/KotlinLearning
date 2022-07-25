package com.example.arraylistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val foods = arrayListOf("Гамбургер", "Пицца", "Картошка фри", "Пепси", "Чизбургер")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = findViewById<ListView>(R.id.food_list)
        val adapter = ArrayAdapter<String>(this, android.R.layout.preference_category, foods)
        foodList.adapter = adapter
    }
}