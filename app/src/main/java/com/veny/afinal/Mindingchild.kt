package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mindingchild : AppCompatActivity() {
    private lateinit var cookingButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mindingchild)

        cookingButton=findViewById(R.id.cookingButton)

        cookingButton.setOnClickListener {
            val intent= Intent (this,lifeskills::class.java)
            startActivity(intent)
        }
    }
}