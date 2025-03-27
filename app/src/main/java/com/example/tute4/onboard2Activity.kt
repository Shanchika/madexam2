package com.example.tute4

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
class onboard2Activity : AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);

        Button continueButton = findViewById(R.id.button);
        Button skipButton = findViewById(R.id.button2);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity
                Intent intent = new Intent(Onboard2Activity.this, NextActivity.class);
                startActivity(intent);
                finish();
            }
        });

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Skip onboarding and navigate to main activity
                Intent intent = new Intent(Onboard2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
