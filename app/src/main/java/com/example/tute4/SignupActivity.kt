package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Find the sign-up button by its ID
        val signUpButton: Button = findViewById(R.id.button54)

        // Set an OnClickListener on the sign-up button
        signUpButton.setOnClickListener {
            // Create an Intent to navigate to Homepage activity
            val intent = Intent(this, HomepageActivity::class.java)

            // Start the new activity
            startActivity(intent)

            // Optionally, finish this activity so it won't be on the back stack
            finish()
        }
    }
}