package com.example.dscsample.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dscsample.R

class SplashScreenActivity : AppCompatActivity() {

    lateinit var bottom_layout:LinearLayout
    lateinit var name_et:EditText
    lateinit var continue_btn:Button
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn" , false)

        setContentView(R.layout.activity_splash_screen)

        continue_btn = findViewById<Button>(R.id.continue_btn)
        name_et = findViewById<EditText>(R.id.name_et)
        bottom_layout = findViewById<LinearLayout>(R.id.bottom_layout)

        bottom_layout.visibility = View.VISIBLE

        continue_btn.setOnClickListener {

            val name = name_et.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username",name)

            Toast.makeText(this, "Welcome! $name", Toast.LENGTH_SHORT).show()

            savePreferences()

            startActivity(intent)
        }

        if(isLoggedIn){
            bottom_layout.visibility = View.GONE

            Handler(Looper.getMainLooper()).postDelayed({
                val startAct = Intent(this,
                    MainActivity::class.java)
                startActivity(startAct)
                finish()
            }, 2200)
        }

    }
    private fun savePreferences() {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("Username", name_et.text.toString() ).apply()
    }
}