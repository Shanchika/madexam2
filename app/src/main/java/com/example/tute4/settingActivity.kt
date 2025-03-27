package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting) // Replace with your layout file

        // ImageView to navigate to Home
        val imageView110: ImageView = findViewById(R.id.imageView110)
        imageView110.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java) // Replace with your HomeActivity
            startActivity(intent)
        }

        // ImageView to navigate to Profile
        val imageView106: ImageView = findViewById(R.id.imageView106)
        imageView106.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java) // Replace with your ProfileActivity
            startActivity(intent)
        }

        // ImageView to navigate to Sign In
        val imageView109: ImageView = findViewById(R.id.imageView109)
        imageView109.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java) // Replace with your SignInActivity
            startActivity(intent)
        }

        // ImageView to navigate to Notifications
        val imageView111: ImageView = findViewById(R.id.imageView111)
        imageView111.setOnClickListener {
            val intent = Intent(this, NotificationsActivity::class.java) // Replace with your NotificationsActivity
            startActivity(intent)
        }
    }
}
