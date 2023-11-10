package com.example.mob_app_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayActivity extends AppCompatActivity {

    Button buttonMainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        buttonMainActivity = findViewById(R.id.buttonMainActivity);
        buttonMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}