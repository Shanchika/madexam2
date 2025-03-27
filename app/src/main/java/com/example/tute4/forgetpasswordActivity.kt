package com.example.tute4

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

class forgetpasswordActivity :AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        EditText newPasswordEditText = findViewById(R.id.editTextTextPassword);
        EditText confirmPasswordEditText = findViewById(R.id.editTextTextPassword2);
        Button submitButton = findViewById(R.id.button5);

        submitButton.setOnClickListener(v -> {
            String newPassword = newPasswordEditText.getText().toString().trim();
            String confirmPassword = confirmPasswordEditText.getText().toString().trim();

            if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(ForgetPasswordActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else if (!newPassword.equals(confirmPassword)) {
                Toast.makeText(ForgetPasswordActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                // Handle password reset logic here (e.g., update password in database)
                Toast.makeText(ForgetPasswordActivity.this, "Password reset successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ForgetPasswordActivity.this, SignInActivity.class));
                finish();
            }
        });
    }
}