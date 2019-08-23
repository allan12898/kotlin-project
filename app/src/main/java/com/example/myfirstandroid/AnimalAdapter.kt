package com.example.myfirstandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listview_item.view.*

class AnimalAdapter(val animalArray: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return animalArray.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.tvAnimalType?.text = animalArray.get(position)
    }


}

class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

    var tvAnimalType = view.tv_animal_type


}