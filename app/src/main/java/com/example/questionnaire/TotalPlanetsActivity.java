package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TotalPlanetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_planets);
        Button verify1Btn = findViewById(R.id.verify_1_btn);
        verify1Btn.setOnClickListener(view -> {
            CheckBox mercuryTxt = findViewById(R.id.mercury_txt);
            CheckBox sunTxt = findViewById(R.id.sun_txt);
            CheckBox moonTxt = findViewById(R.id.moon_txt);
            CheckBox jupiterTxt = findViewById(R.id.jupiter_txt);
            CheckBox saturnTxt = findViewById(R.id.saturn_txt);
            CheckBox plutoTxt = findViewById(R.id.pluto_txt);
            if (mercuryTxt.isChecked() && jupiterTxt.isChecked() && saturnTxt.isChecked() && sunTxt.isChecked() == false && moonTxt.isChecked() == false && plutoTxt.isChecked() == false) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }
        });
    }
}