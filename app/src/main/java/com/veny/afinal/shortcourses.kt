package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shortcourses : AppCompatActivity() {

    private lateinit var backButton3: Button
    private lateinit var contactUsButton: Button // Renamed to avoid conflict


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shortcourses)



        contactUsButton.setOnClickListener {
            val intent = Intent(this, contactus::class.java)
            startActivity(intent)
        }


    }
}
