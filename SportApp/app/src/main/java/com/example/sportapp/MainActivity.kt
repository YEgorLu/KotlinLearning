package com.example.sportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Toast.makeText(this, "allIsWorking", Toast.LENGTH_LONG).show()
                val intent = Intent(this@MainActivity, CategorySportActivity::class.java)
                startActivity(intent)
            }
        }

        val listView = findViewById<ListView>(R.id.list_item)
        listView.onItemClickListener = itemClickListener
    }


}