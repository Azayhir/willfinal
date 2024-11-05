package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button = findViewById(R.id.learnMore)

        Button.setOnClickListener {
            val intent = Intent(this, Aboutus::class.java)
            startActivity(intent)
        }

    }
}