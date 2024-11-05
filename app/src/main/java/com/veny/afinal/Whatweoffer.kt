package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Whatweoffer : AppCompatActivity() {
    private lateinit var backButton2: Button
    private lateinit var coursesbutton: Button
    private lateinit var contactus3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatweoffer)
        backButton2 = findViewById(R.id.backButton2)
        coursesbutton = findViewById(R.id.coursesbutton)
         contactus3 = findViewById(R.id.contactUs3)

        backButton2.setOnClickListener {
            onBackPressed() // Calls the default back button behavior
        }
        coursesbutton.setOnClickListener {
            val intent = Intent(this, courses::class.java)
            startActivity(intent)
        }
    }
}