package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cookingcourse : AppCompatActivity() {

    private lateinit var bookingBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cookingcourse)

        bookingBtn=findViewById(R.id.bookingBtn)

        bookingBtn.setOnClickListener {
            val intent= Intent (this,bookingpage::class.java)
            startActivity(intent)
        }


    }
}