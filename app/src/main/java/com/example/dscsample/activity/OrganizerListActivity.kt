package com.example.dscsample.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dscsample.R
import com.example.dscsample.adapters.OrganizerAdapter
import com.example.dscsample.model.Members

lateinit var back_btn: ImageButton


class OrganizerListActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organizer_list)

        back_btn = findViewById<ImageButton>(R.id.back_btn)

        val recyclerView = findViewById<RecyclerView>(R.id.organizer_list)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val members = ArrayList<Members>()

        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))
        members.add(Members("XYZ","Android ",R.drawable.header))

        val adapter = OrganizerAdapter(members)
        recyclerView.adapter = adapter

        back_btn.setOnClickListener {
            onBackPressed()
        }
    }
}