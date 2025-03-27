package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Find the SignIn button from the layout
        val signinButton: Button = findViewById(R.id.button55)
        // Find the SignUp button from the layout
        val signupButton: Button = findViewById(R.id.button51)

        // Set an onClickListener for the SignIn button
        signInButton.setOnClickListener {
            // Create an Intent to navigate to SignInActivity
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

        // Set an onClickListener for the SignUp button
        signUpButton.setOnClickListener {
            // Create an Intent to navigate to SignUpActivity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
