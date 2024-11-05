package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class courses : AppCompatActivity() {
    private lateinit var button2: Button
    private lateinit var btnBook: Button
    private lateinit var firstaidbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        button2= findViewById(R.id.button2)
        btnBook= findViewById(R.id.btnBook)
        firstaidbtn= findViewById(R.id.firstaidbtn)

        firstaidbtn.setOnClickListener {
            val intent = Intent(this,firstaid::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            onBackPressed() // Calls the default back button behavior
        }
        btnBook.setOnClickListener {
            val intent = Intent(this, bookingpage::class.java)
            startActivity(intent)
        }



    }
}