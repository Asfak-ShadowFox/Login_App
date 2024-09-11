package com.example.myapply;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcomeMessage = findViewById(R.id.welcomeMessage);

        String username = getIntent().getStringExtra("user");
        welcomeMessage.setText("Welcome, " + username + "!");
    }
}
