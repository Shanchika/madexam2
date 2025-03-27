package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)  // Replace with your XML layout file name

        // Find the ImageView by its ID
        val imageView = findViewById<ImageView>(R.id.imageView112)

        // Set the click listener
        imageView.setOnClickListener {
            // Intent to navigate to SettingsActivity
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
    }
}