package com.example.tute4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_page1.*

class Page1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        // Navigate to activity_payment.xml when button26 is clicked
        button26.setOnClickListener {
            val intent = Intent(this, Payment1Activity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_home.xml when imageView43 is clicked
        imageView43.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_profile.xml when imageView41 is clicked
        imageView41.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_setting.xml when imageView42 is clicked
        imageView42.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_page2.xml when button14 is clicked
        button14.setOnClickListener {
            val intent = Intent(this, Page2Activity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_page3.xml when button15 is clicked
        button15.setOnClickListener {
            val intent = Intent(this, Page3Activity::class.java)
            startActivity(intent)
        }

        // Navigate to activity_home.xml when imageView5 is clicked
        imageView5.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }
    }
}
