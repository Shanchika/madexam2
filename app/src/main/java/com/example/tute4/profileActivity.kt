package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Setting up the click listener for the imageView95
        val imageView95: ImageView = findViewById(R.id.imageView95)
        imageView95.setOnClickListener {
            // Navigate to ProfileActivity
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
    }
}
