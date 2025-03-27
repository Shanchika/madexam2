package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Payment3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment3)

        // Button navigation to Page2Activity
        val button29: Button = findViewById(R.id.button29)
        button29.setOnClickListener {
            // Navigate to Page2Activity
            val intent = Intent(this, Page2Activity::class.java)
            startActivity(intent)
        }
    }
}
