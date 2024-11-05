package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstaid : AppCompatActivity() {

    private lateinit var landscapeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstaid)

        landscapeBtn= findViewById(R.id.landscapeBtn)

        landscapeBtn.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }
    }
}