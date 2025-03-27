package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // Change the layout resource accordingly

        // Button for navigating to ActivityPage1
        val button1: Button = findViewById(R.id.button7)
        button1.setOnClickListener {
            val intent = Intent(this, ActivityPage1::class.java)
            startActivity(intent)
        }

        // ImageView for navigating to ActivityProfile
        val imageViewProfile: ImageView = findViewById(R.id.imageView27)
        imageViewProfile.setOnClickListener {
            val intent = Intent(this, ActivityProfile::class.java)
            startActivity(intent)
        }

        // ImageView for navigating to ActivitySetting
        val imageViewSetting: ImageView = findViewById(R.id.imageView28)
        imageViewSetting.setOnClickListener {
            val intent = Intent(this, ActivitySetting::class.java)
            startActivity(intent)
        }
    }
}