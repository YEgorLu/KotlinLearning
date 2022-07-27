package com.example.grumpycat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class GrumpyCatAdapter(val cats: List<GrumpyCat>) :
    RecyclerView.Adapter<GrumpyCatAdapter.Companion.CatHolder>() {
    companion object {
        class CatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val image = itemView.findViewById<ImageView>(R.id.item_image)
            val name = itemView.findViewById<TextView>(R.id.item_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_cat, parent, false)
        return CatHolder(itemView)
    }

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        val grumpyCat = cats[position]

        Picasso.get().load(grumpyCat.imageSrc).into(holder.image);
        holder.name.text = grumpyCat.name
    }

    override fun getItemCount(): Int {
        return cats.size
    }
}