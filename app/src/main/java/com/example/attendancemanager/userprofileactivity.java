package com.example.attendancemanager;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userprofileactivity extends AppCompatActivity {

    private EditText etRollNumber;
    private EditText etName;
    private Button btSave;
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile2);

        sharedPreferences = this.getSharedPreferences(
                "attendance",MODE_PRIVATE
        );

        etName = findViewById(R.id.name);
        etRollNumber = findViewById(R.id.roll_number);
        btSave = findViewById(R.id.save);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String roll = etRollNumber.getText().toString();
                Log.i("User","Name : " + name + "Roll No: " + roll);
                Toast.makeText(userprofileactivity.this, "Name :"+ name + "Roll No :"+roll+ ,
                        Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(s:"name",name);
                edit.putString(s:"rollnumber",roll);
                edit.apply();
            }
        });


    }
}
