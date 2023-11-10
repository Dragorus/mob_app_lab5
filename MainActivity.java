package com.example.mob_app_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewCost;
    Button buttonPayActivity;
    RadioButton format1, format2, format3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCost = findViewById(R.id.textViewCost);
        format1 = findViewById(R.id.radioButtonFormat1);
        format2 = findViewById(R.id.radioButtonFormat2);
        format3 = findViewById(R.id.radioButtonFormat3);
        buttonPayActivity = findViewById(R.id.buttonPayActivity);
        buttonPayActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayActivity.class);
                startActivity(intent);
            }
        });
    }
}