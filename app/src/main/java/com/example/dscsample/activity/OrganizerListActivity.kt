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

        members.add(Members("Divyanshi Gupta","DSC LEAD",R.drawable.divyanshi))
        members.add(Members("Adarsh Gupta","EVENT MANAGER",R.drawable.adarsh))
        members.add(Members("Aditi Jindal","MARKETING ASSOCIATE",R.drawable.aditi))
        members.add(Members("Ashish Soyetra","EVENT MANAGER",R.drawable.ashish))
        members.add(Members("Jagpreet Makkad","EVENT MANAGER",R.drawable.jagpreet))
        members.add(Members("Harpreet Kaur","CONTENT WRITER",R.drawable.harpreet))
        members.add(Members("Mekhala Singh","MARKETING ASSOCIATE",R.drawable.mekhala))
        members.add(Members("D Jaishintha","MARKETING ASSOCIATE",R.drawable.jaishintha))
        members.add(Members("Ashish Chawda","DOMAIN HEAD",R.drawable.ashish_chawda))
        members.add(Members("Krishna Sahu","DOMAIN HEAD",R.drawable.krishna))
        members.add(Members("Disha Dave","DOMAIN HEAD",R.drawable.disha))
        members.add(Members("Nomit Kasera","DOMAIN HEAD",R.drawable.nomit))
        members.add(Members("Parul Verma","GRAPHIC DESIGNER",R.drawable.parul))
        members.add(Members("Bhushan Guru","GRAPHIC DESIGNER",R.drawable.bhushan))
        members.add(Members("Akhilesh Soni","DOMAIN HEAD",R.drawable.akhilesh))
        members.add(Members("Vibhu Manikpuri","DOMAIN HEAD",R.drawable.vibhu))
        members.add(Members("Yonit Chauhan","DOMAIN HEAD",R.drawable.yonit))
        members.add(Members("Kajal Singh","GRAPHIC DESIGNER / DOMAIN HEAD",R.drawable.kajal))
        members.add(Members("Sameer Sharma","PLATFORM MANAGER",R.drawable.sameer))
        members.add(Members("Rohit Verma","DOMAIN HEAD",R.drawable.rohit))

        val adapter = OrganizerAdapter(members)
        recyclerView.adapter = adapter

        back_btn.setOnClickListener {
            onBackPressed()
        }
    }
}