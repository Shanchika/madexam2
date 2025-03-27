package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Page3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)  // Replace with your actual layout file name

        // Button to navigate to Page1
        val button17: Button = findViewById(R.id.button17)
        button17.setOnClickListener {
            val intent = Intent(this, Page1Activity::class.java)  // Replace Page1Activity with your actual page 1 activity
            startActivity(intent)
        }

        // Button to navigate to Page2
        val button14: Button = findViewById(R.id.button14)
        button14.setOnClickListener {
            val intent = Intent(this, Page2Activity::class.java)  // Replace Page2Activity with your actual page 2 activity
            startActivity(intent)
        }

        // ImageView to navigate to Homepage
        val imageView43: ImageView = findViewById(R.id.imageView43)
        imageView43.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)  // Replace HomepageActivity with your homepage activity
            startActivity(intent)
        }

        // ImageView to navigate to Profile Page
        val imageView41: ImageView = findViewById(R.id.imageView41)
        imageView41.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)  // Replace ProfileActivity with your profile activity
            startActivity(intent)
        }

        // ImageView to navigate to Setting Page
        val imageView42: ImageView = findViewById(R.id.imageView42)
        imageView42.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)  // Replace SettingActivity with your settings activity
            startActivity(intent)
        }

        // ImageView to navigate to Page2
        val imageView80: ImageView = findViewById(R.id.imageView80)
        imageView80.setOnClickListener {
            val intent = Intent(this, Page2Activity::class.java)  // Replace Page2Activity with your actual page 2 activity
            startActivity(intent)
        }
    }
}
