package com.example.tute4

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

class SignupActivity : AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText nameEditText = findViewById(R.id.editTextText);
        EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword);
        EditText confirmPasswordEditText = findViewById(R.id.editTextTextPassword2);
        Button signUpButton = findViewById(R.id.button5);
        Button googleSignUpButton = findViewById(R.id.button3);
        Button facebookSignUpButton = findViewById(R.id.button4);
        TextView signInText = findViewById(R.id.textView11);

        signUpButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            String confirmPassword = confirmPasswordEditText.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(SignUpActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(SignUpActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                // Handle user registration (Replace with actual logic)
                Toast.makeText(SignUpActivity.this, "Sign up successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                finish();
            }
        });

        googleSignUpButton.setOnClickListener(v ->
        Toast.makeText(SignUpActivity.this, "Google Sign-Up Clicked", Toast.LENGTH_SHORT).show()
        );

        facebookSignUpButton.setOnClickListener(v ->
        Toast.makeText(SignUpActivity.this, "Facebook Sign-Up Clicked", Toast.LENGTH_SHORT).show()
        );

        signInText.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this, SignInActivity.class)));
    }
}