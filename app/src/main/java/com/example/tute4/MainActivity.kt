package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tute4.models.Calculator

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                // Reference the ImageView
                val imageView = findViewById<ImageView>(R.id.imageView)

                // Set the image programmatically
                imageView.setImageResource(R.drawable.my_image)

        }}

