package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        // ImageView to navigate to Home
        val imageView110: ImageView = findViewById(R.id.imageView110)
        imageView110.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        // ImageView to navigate to Profile
        val imageView106: ImageView = findViewById(R.id.imageView106)
        imageView106.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // ImageView to navigate to Sign In
        val imageView109: ImageView = findViewById(R.id.imageView109)
        imageView109.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }

        // ImageView to navigate to Notifications
        val imageView111: ImageView = findViewById(R.id.imageView111)
        imageView111.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }
    }
}
