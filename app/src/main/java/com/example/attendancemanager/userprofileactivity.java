package com.example.attendancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class userprofileactivity extends AppCompatActivity {

    private EditText etRollNumber;
    private EditText etName;
    private Button btSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile2);

        etName = findViewById(R.id.name);
        etRollNumber = findViewById(R.id.roll_number);
        btSave = findViewById(R.id.save);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String roll = etRollNumber.getText().toString();
                Log.i("User","Name : " + name);
            }
        });


    }
}
