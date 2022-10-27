package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TotalPlanetsInSolarSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_planets_in_solar_system);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioButton radio10Txt = findViewById(R.id.radio_10_txt);
            if (radio10Txt.isChecked()) {
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radio8Txt = findViewById(R.id.radio_8_txt);
            if (radio8Txt.isChecked()) {
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
            }
            RadioButton radio12Txt = findViewById(R.id.radio_12_txt);
            if (radio12Txt.isChecked()) {
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radio9Txt = findViewById(R.id.radio_9_txt);
            if (radio9Txt.isChecked()) {
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
        });
    }
}