package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nameTextView = findViewById(R.id.textViewName);
        TextView uidTextView = findViewById(R.id.textViewUID);

        // Getting data from the intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String uid = intent.getStringExtra("uid");

        // Displaying data in TextViews
        nameTextView.setText("Name: " + name);
        uidTextView.setText("UID: " + uid);
    }
}
