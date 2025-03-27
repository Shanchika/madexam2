package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        // Finding views by their IDs
        val signInButton: Button = findViewById(R.id.button54)
        val forgetPasswordText: TextView = findViewById(R.id.textView6)

        // Navigate to Home activity on Sign In button click
        signInButton.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Forgot Password activity on click
        forgetPasswordText.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}