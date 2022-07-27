package com.example.grumpycat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = GrumpyCatAdapter(generateCats())
        recyclerView.adapter = adapter
    }

    private fun generateCats(): List<GrumpyCat> {
        val cats = ArrayList<GrumpyCat>()
        cats.add(GrumpyCat("Rip Cat","https://i.imgur.com/XSYZSIF.jpeg"))
        cats.add(GrumpyCat("Birthday Cat","https://i.imgur.com/Bt3Ltzz.jpeg"))
        cats.add(GrumpyCat("Cartoon Cat","https://i.imgur.com/jeKJG.png"))
        cats.add(GrumpyCat("Daily Cat","https://i.imgur.com/T6T0H.jpeg"))
        cats.add(GrumpyCat("Christmas Cat","https://i.imgur.com/S2vnl.jpeg"))
        cats.add(GrumpyCat("Small Cat","https://i.imgur.com/o95GOtw.jpeg"))
        cats.add(GrumpyCat("Rip Cat","https://i.imgur.com/XSYZSIF.jpeg"))
        cats.add(GrumpyCat("Birthday Cat","https://i.imgur.com/Bt3Ltzz.jpeg"))
        cats.add(GrumpyCat("Cartoon Cat","https://i.imgur.com/jeKJG.png"))
        cats.add(GrumpyCat("Daily Cat","https://i.imgur.com/T6T0H.jpeg"))
        cats.add(GrumpyCat("Christmas Cat","https://i.imgur.com/S2vnl.jpeg"))
        cats.add(GrumpyCat("Small Cat","https://i.imgur.com/o95GOtw.jpeg"))

        return cats
    }
}