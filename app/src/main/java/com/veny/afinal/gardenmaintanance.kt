package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gardenmaintanance : AppCompatActivity() {

    private lateinit var cookingBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gardenmaintanance)

        cookingBtn= findViewById(R.id.cookingBtn)

        cookingBtn.setOnClickListener {
            val intent= Intent (this,cookingcourse::class.java)
            startActivity(intent)
        }
    }
}