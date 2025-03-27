package com.example.tute4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.widget.Button

class Onboard1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        val continueButton: Button = findViewById(R.id.button55)
        val skipButton: Button = findViewById(R.id.button100)

        // Navigate to Onboard3Activity when "Continue" button is clicked
        continueButton.setOnClickListener {
            val intent = Intent(this, Onboard3Activity::class.java)
            startActivity(intent)
        }

        // Navigate to WelcomeActivity when "Skip" button is clicked
        skipButton.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}