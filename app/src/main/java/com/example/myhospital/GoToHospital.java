package com.example.myhospital;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoToHospital extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_hospitals);

        TextView text = findViewById(R.id.result);

        text.setText(Patient.getPatient().getResult());
    }
}
