package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Payment2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment2)

        // Button navigation to Payment3Activity
        val button18: Button = findViewById(R.id.button18)
        button18.setOnClickListener {
            // Navigate to Payment3Activity
            val intent = Intent(this, Payment3Activity::class.java)
            startActivity(intent)
        }
    }
}
