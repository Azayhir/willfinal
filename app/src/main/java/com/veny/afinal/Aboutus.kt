package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Aboutus : AppCompatActivity() {
    private lateinit var Button: Button
    private lateinit var  scrolldown: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)
        scrolldown = findViewById(R.id.scrolldown)

        Button = findViewById(R.id.backButton)
        scrolldown.setOnClickListener {
            val intent = Intent(this, Whatweoffer::class.java)
            startActivity(intent)
        }

        Button.setOnClickListener {
            onBackPressed() // Calls the default back button behavior
        }
    }

    override fun onBackPressed() {
        super.onBackPressed() // Handle back navigation
        }

    }

