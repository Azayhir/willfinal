package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class contactus : AppCompatActivity() {
    private lateinit var backButton4: Button
    private lateinit var messageTextView: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)
        // Initialize button and TextView
        submitButton = findViewById(R.id.submitButton)
        messageTextView = findViewById(R.id.textView4)
        backButton4 = findViewById(R.id.backButton4)

        // Initialize EditText fields
        val firstNameEditText: EditText = findViewById(R.id.editTextText)
        val lastNameEditText: EditText = findViewById(R.id.editTextText2)
        val emailEditText: EditText = findViewById(R.id.editTextText3)
        val phoneNumberEditText: EditText = findViewById(R.id.editTextText4)
        val subjectMessageEditText: EditText = findViewById(R.id.editTextText5)

        backButton4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Replace MainActivity with your home activity class
            startActivity(intent)
        }

        // Submit button click event
        submitButton.setOnClickListener {
            Log.d("MainActivity", "Button clicked")

            // Show confirmation message
            messageTextView.text = "Your information has been saved and sent"
            messageTextView.visibility = TextView.VISIBLE
        }

        // Add TextWatcher to check if all fields are empty
        val textWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Hide message if all fields are empty
                if (firstNameEditText.text.isEmpty() &&
                    lastNameEditText.text.isEmpty() &&
                    emailEditText.text.isEmpty() &&
                    phoneNumberEditText.text.isEmpty() &&
                    subjectMessageEditText.text.isEmpty()
                ) {
                    messageTextView.visibility = TextView.GONE
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        // Attach TextWatcher to all EditText fields
        firstNameEditText.addTextChangedListener(textWatcher)
        lastNameEditText.addTextChangedListener(textWatcher)
        emailEditText.addTextChangedListener(textWatcher)
        phoneNumberEditText.addTextChangedListener(textWatcher)
        subjectMessageEditText.addTextChangedListener(textWatcher)
    }
}

