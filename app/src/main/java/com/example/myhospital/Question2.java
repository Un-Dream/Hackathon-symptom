package com.example.myhospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox box1 = findViewById(R.id.checkBox7);
                CheckBox box2 = findViewById(R.id.checkBox8);
                CheckBox box3 = findViewById(R.id.checkBox9);

                if (box1.isChecked() || box2.isChecked() || box3.isChecked()) {
                    Patient.getPatient().setESI(2);
                    openResult();
                } else {
                    Patient.getPatient().setESI(3);
                    openResult();
                }
            }
        });
    }

    public void openResult(){
        startActivity(new Intent(this, GoToHospital.class));
    }
}
