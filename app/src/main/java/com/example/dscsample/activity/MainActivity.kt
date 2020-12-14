package com.example.dscsample.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dscsample.R
import com.google.android.material.chip.Chip

lateinit var linkedin_chip:Chip
lateinit var instagram_chip:Chip
lateinit var email_chip:Chip
lateinit var slack_chip:Chip
lateinit var organizer_btn:Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       linkedin_chip = findViewById(R.id.linkedin_chip)
       instagram_chip = findViewById(R.id.instagram_chip)
       slack_chip = findViewById(R.id.slack_chip)
       organizer_btn = findViewById(R.id.organizer_btn)


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