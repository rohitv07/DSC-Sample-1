package com.example.dscsample.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dscsample.R
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {

    lateinit var linkedin_chip:Chip
    lateinit var instagram_chip:Chip
    lateinit var email_chip:Chip
    lateinit var slack_chip:Chip
    lateinit var organizer_btn:Button
    lateinit var txtUserName:TextView
    lateinit var sharedPreferences: SharedPreferences



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_main)

        val username= sharedPreferences.getString("Username","User")

        linkedin_chip = findViewById(R.id.linkedin_chip)
        instagram_chip = findViewById(R.id.instagram_chip)
        slack_chip = findViewById(R.id.slack_chip)
        organizer_btn = findViewById(R.id.organizer_btn)
        txtUserName = findViewById(R.id.txt_user_name)

        txtUserName.text = "Welcome ${username},"


        linkedin_chip.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/dscsstc/")
            startActivity(intent)
        }

        instagram_chip.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/dsc_sstc/")
            startActivity(intent)
        }

        slack_chip.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://dscsstc.slack.com")
            startActivity(intent)
        }

        organizer_btn.setOnClickListener {
            val intent = Intent(this, OrganizerListActivity::class.java)
            startActivity(intent)
        }

        //TODO email_chip has to be added

    }

}