package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboard3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        val continueButton: Button = findViewById(R.id.button55)
        val skipButton: Button = findViewById(R.id.button100)

        // Navigate to WelcomeActivity when "Continue" button is clicked
        continueButton.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }

        // Navigate to WelcomeActivity when "Skip" button is clicked
        skipButton.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}