package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lifeskills : AppCompatActivity() {

    private lateinit var gardenMainBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifeskills)

        gardenMainBtn=findViewById(R.id.gardenMainBtn)

        gardenMainBtn.setOnClickListener {
            val intent= Intent (this,gardenmaintanance::class.java)
            startActivity(intent)
        }




    }
}