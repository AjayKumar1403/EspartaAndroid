package com.example.esparta_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    // UI elements
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI elements
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.buttonLogin);

        // Set click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get entered username and password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // TODO: Validate credentials with a backend server
                if (isValidCredentials(username, password)) {
                    // If credentials are valid, navigate to the home screen
                    navigateToHome();
                } else {
                    // If credentials are invalid, show an error message
                    showError();
                }
            }
        });

           }

    private boolean isValidCredentials(String username, String password) {
        // For simplicity, consider the login valid if both fields are not empty
        return !username.isEmpty() && !password.isEmpty();
    }

    private void navigateToHome() {
        // TODO: Replace HomeActivity with the actual home screen activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Close the login activity to prevent going back
    }


    private void showError() {
        // TODO: Show an error message to the user (e.g., using a Toast)
    }

}