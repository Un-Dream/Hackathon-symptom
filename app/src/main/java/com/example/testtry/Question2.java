package com.example.testtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import 

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        private Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox box1 = (CheckBox)findViewById(R.id.checkBox);
                CheckBox box2 = (CheckBox)findViewById(R.id.checkBox2);
                CheckBox box3 = (CheckBox)findViewById(R.id.checkBox3);
                CheckBox box4 = (CheckBox)findViewById(R.id.checkBox4);
                CheckBox box5 = (CheckBox)findViewById(R.id.checkBox5);
                CheckBox box6 = (CheckBox)findViewById(R.id.checkBox6);

                if (box1.isChecked() || box2.isChecked() || box3.isChecked() || box4.isChecked() || box5.isChecked() || box6.isChecked() || ){
                    openCall911();
                }else{
                    openquestion3();
                }
            }
        });
    }

    public void openquestion3(){
        Intent intent = new Intent(this, Call.class);
        startActivity(intent);
    }
}
