package com.example.recyclerview.ListAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Model.ImageListAdapter
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.text_messages.view.*

class ConvoListAdapter(val data:MutableList<ImageListAdapter>):
    RecyclerView.Adapter<ConvoListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image:ImageView = view.person_image
        val name: TextView = view.convo_name_
        val message: TextView= view.your_msges
        val time : TextView= view.time_sent
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val viewGroup =  LayoutInflater.from(parent.context).inflate(R.layout.text_messages,parent,false)
       return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
      return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.message.text = data[position].message
        holder.name.text = data[position].name
        holder.time.text = data[position].time.toString()
        holder.image.setImageDrawable(data[position].image)
    }



}