package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class Payment1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment1)

        // Button navigation to Payment2Activity
        val button16: Button = findViewById(R.id.button16)
        button16.setOnClickListener {
            // Navigate to Payment2Activity
            val intent = Intent(this, Payment2Activity::class.java)
            startActivity(intent)
        }

        // ImageView navigation to Page1Activity
        val imageView90: ImageView = findViewById(R.id.imageView90)
        imageView90.setOnClickListener {
            // Navigate to Page1Activity
            val intent = Intent(this, Page1Activity::class.java)
            startActivity(intent)
        }
    }
}
