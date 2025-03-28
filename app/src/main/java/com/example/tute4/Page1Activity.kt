package com.example.tute4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tute4.databinding.ActivityPage1Binding


    class Page1Activity : AppCompatActivity() {

        private lateinit var binding: ActivityPage1Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityPage1Binding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.button26.setOnClickListener {
                val intent = Intent(this, Payment1Activity::class.java)
                startActivity(intent)


                // Navigate to activity_home.xml when imageView43 is clicked
                val imageViewX = findViewById<ImageView>(R.id.imageView43)
                imageViewX.setOnClickListener {
                    val intent = Intent(this, HomepageActivity::class.java)
                    startActivity(intent)
                }




                // Handling ImageView for image11 (Navigate to profile page)
                val imageViewProfile = findViewById<ImageView>(R.id.imageView41)
                imageViewProfile.setOnClickListener {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }

                // Handling ImageView for image8 (Navigate to setting page)
                val imageViewSetting = findViewById<ImageView>(R.id.imageView42)
                imageViewSetting.setOnClickListener {
                    val intent = Intent(this, SettingActivity::class.java)
                    startActivity(intent)
                }


                // Navigate to activity_page2.xml when button14 is clicked

                val buttonB16 = findViewById<Button>(R.id.button14)
                buttonB16.setOnClickListener {
                    val intent = Intent(this, Page2Activity::class.java)
                    startActivity(intent)
                }


                // Navigate to activity_page3.xml when button15 is clicked
                val buttonB17 = findViewById<Button>(R.id.button15)
                buttonB17.setOnClickListener {
                    val intent = Intent(this, Page3Activity::class.java)
                    startActivity(intent)
                }

                // Navigate to activity_home.xml when imageView5 is clicked
                val imageViewHomepage = findViewById<ImageView>(R.id.imageView5)
                imageViewHomepage.setOnClickListener {
                    val intent = Intent(this, HomepageActivity::class.java)
                    startActivity(intent)
                }

            }
        }
    }