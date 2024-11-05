package com.veny.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlin.time.times

class bookingpage : AppCompatActivity() {
    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2: CheckBox
    private lateinit var checkBox3: CheckBox
    private lateinit var checkBox4: CheckBox
    private lateinit var checkBox5: CheckBox
    private lateinit var checkBox6: CheckBox
    private lateinit var checkBox7: CheckBox
    private lateinit var totalFeesTextView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookingpage)

        // Initialize CheckBoxes and Button
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkbox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)
        checkBox5 = findViewById(R.id.checkbox5)
        checkBox6 = findViewById(R.id.checkBox6)
        checkBox7 = findViewById(R.id.checkBox7)
        val shortcouresbtn: Button= findViewById(R.id.shortcouresbtn)
        shortcouresbtn.setOnClickListener {
            val intent = Intent(this, shortcourses::class.java)
            startActivity(intent)
        }

        val calculateButton: Button = findViewById(R.id.Calculate_Fees_Button)
        totalFeesTextView = findViewById(R.id.totalfees)

        // Set up button click listener
        calculateButton.setOnClickListener {
            calculateTotalFees()
        }
    }

    private fun calculateTotalFees() {
        var total = 0.0 // Change total to Double
        var selectedCourses = 0

        // Calculate fees based on which CheckBoxes are checked
        if (checkBox1.isChecked) {
            total += 1500.0 // Add as Double
            selectedCourses++
        }
        if (checkBox2.isChecked) {
            total += 1500.0 // Add as Double
            selectedCourses++
        }
        if (checkBox3.isChecked) {
            total += 1500.0 // Add as Double
            selectedCourses++
        }
        if (checkBox4.isChecked) {
            total += 1500.0 // Add as Double
            selectedCourses++
        }
        if (checkBox5.isChecked) {
            total += 750.0 // Add as Double
            selectedCourses++
        }
        if (checkBox6.isChecked) {
            total += 750.0 // Add as Double
            selectedCourses++
        }
        if (checkBox7.isChecked) {
            total += 750.0 // Add as Double
            selectedCourses++
        }

        // Store total before discount for display
        val totalBeforeDiscount = total

        // Apply discounts based on the number of selected courses
        when {
            selectedCourses == 2 -> total *= 0.95 // 5% off
            selectedCourses == 3 -> total *= 0.90 // 10% off
            selectedCourses > 3 -> total *= 0.85 // 15% off
        }

        // Update the TextViews with the totals
        totalFeesTextView.text = "Total Fees: R$totalBeforeDiscount"
        totalFeesTextView.text = "Total after Discount: R$total"
    }
}
