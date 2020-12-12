package com.example.dscsample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dscsample.R
import com.example.dscsample.model.Members

class OrganizerAdapter(val memberlist:ArrayList<Members>):RecyclerView.Adapter<OrganizerAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

        val name = view.findViewById<TextView>(R.id.name)
        val post = view.findViewById<TextView>(R.id.post)
        var image = view.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_organizer, parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val members:Members = memberlist[position]

        holder.name.text = members.name
        holder.post.text = members.post
        holder.image.setImageResource(members.image)
    }

    override fun getItemCount(): Int {
        return memberlist.size
    }


}