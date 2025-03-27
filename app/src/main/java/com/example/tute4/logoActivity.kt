package com.example.tute4


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        val getStartedButton: Button = findViewById(R.id.button30)
        getStartedButton.setOnClickListener {
            val intent = Intent(this, Onboard1Activity::class.java)
            startActivity(intent)
        }
    }
}