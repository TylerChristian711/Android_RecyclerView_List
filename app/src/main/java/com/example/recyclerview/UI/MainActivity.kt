package com.example.recyclerview.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ListAdapter.ConvoListAdapter
import com.example.recyclerview.Model.ImageListAdapter
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val data = mutableListOf<ImageListAdapter>()
       val contactImage =ContextCompat.getDrawable(this,R.drawable.ic_action_name)
        if(contactImage != null) {
            data.add(ImageListAdapter(contactImage, "Alex", "Lets get food", 12837698))
        }

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val adapter = ConvoListAdapter(data)
        list_view.layoutManager = manager
        list_view.adapter = adapter

    }
}
