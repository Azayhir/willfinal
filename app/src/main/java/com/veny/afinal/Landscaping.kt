package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Landscaping : AppCompatActivity() {

    private lateinit var sowingBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        sowingBtn = findViewById(R.id.sewingBtn)

        sowingBtn.setOnClickListener {
            val intent = Intent(this, sewing::class.java)
            startActivity(intent)
        }
    }
}