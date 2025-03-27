package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        // Finding the Submit button
        val submitButton: Button = findViewById(R.id.button54)

        // Navigate to Sign In activity on Submit button click
        submitButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java) // Replace with your SignInActivity class name
            startActivity(intent)
        }
    }
}