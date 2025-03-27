package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        // Handling ImageView for arr (Navigate to activity_page1.xml)
        val imageViewArr = findViewById<ImageView>(R.id.imageView55)
        imageViewArr.setOnClickListener {
            val intent = Intent(this, ActivityPage1::class.java)
            startActivity(intent)
        }

        // Handling Button for b6 (Navigate to activity_page1.xml)
        val buttonB6 = findViewById<Button>(R.id.button17)
        buttonB6.setOnClickListener {
            val intent = Intent(this, ActivityPage1::class.java)
            startActivity(intent)
        }

        // Handling Button for b8 (Navigate to activity_page3.xml)
        val buttonB8 = findViewById<Button>(R.id.button15)
        buttonB8.setOnClickListener {
            val intent = Intent(this, ActivityPage3::class.java)
            startActivity(intent)
        }

        // Handling ImageView for x (Navigate to home page)
        val imageViewX = findViewById<ImageView>(R.id.imageView43)
        imageViewX.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Handling ImageView for image11 (Navigate to profile page)
        val imageViewProfile = findViewById<ImageView>(R.id.imageView41)
        imageViewProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Handling ImageView for image8 (Navigate to setting page)
        val imageViewSettings = findViewById<ImageView>(R.id.imageView42)
        imageViewSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
