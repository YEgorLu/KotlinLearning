package com.example.sportapp

import android.R
import android.app.ListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class CategorySportActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = listView
        val listAdapter = ArrayAdapter<Sport>(this, R.layout.simple_list_item_1, Sport.sports)
        listView.adapter = listAdapter
    }

    override fun onListItemClick(l : ListView, v : View, position: Int, id : Long){
        val intent = Intent(this@CategorySportActivity, SportActivity::class.java)
        intent.putExtra(SportActivity.EXTRA_SPORT, id.toInt())
        startActivity(intent)
    }
}