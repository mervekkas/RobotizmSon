package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SoruIsaretiActivity extends AppCompatActivity {

    TextView kullanimText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru_isartei);

        kullanimText = findViewById(R.id.kullanimText);

        kullanimText.setText("ne yazcağımı bulamadım bu böyle dursun");

    }
}
