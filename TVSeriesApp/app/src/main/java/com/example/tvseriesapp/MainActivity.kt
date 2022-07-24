package com.example.tvseriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView

val seriesList = SeriesList()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickChoose(view: View) {
        val textView = findViewById<TextView>(R.id.series_text)
        val spinner = findViewById<Spinner>(R.id.genre_list)
        val selected = spinner.selectedItem.toString()
        val listTV = seriesList.getListTv(selected)
        val listModified = StringBuilder()
        for (show in listTV)
            listModified.append(show).append('\n')
        textView.text = listModified.toString()
    }
}