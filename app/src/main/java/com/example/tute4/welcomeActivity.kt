package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*
class welcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome) // Set the layout file

        // Initialize views
        val continueButton = button
        val skipButton = button2
        val blueDotImageView = iconImageView // Note: Fix duplicate IDs in XML
        val grayDotImageView1 = iconImageView // Note: Fix duplicate IDs in XML
        val grayDotImageView2 = iconImageView // Note: Fix duplicate IDs in XML
        val mainImageView = imageView
        val titleTextView = textView4
        val subtitleTextView = textView5
        val backgroundTextView = textView7

        // Set up button click listeners
        continueButton.setOnClickListener {
            // Handle continue button click
            // Example: Navigate to the next screen
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        skipButton.setOnClickListener {
            // Handle skip button click
            // Example: Navigate to the main screen or skip the onboarding process
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
    }
}
