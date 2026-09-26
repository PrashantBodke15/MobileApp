package com.example.studentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etCourse;
    Button btnRegister;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML components with Java
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etCourse = findViewById(R.id.etCourse);
        btnRegister = findViewById(R.id.btnRegister);
        tvResult = findViewById(R.id.tvResult);

        // Register button
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String course = etCourse.getText().toString();

                if (name.isEmpty() || email.isEmpty() || course.isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Please fill all fields",
                            Toast.LENGTH_SHORT
                    ).show();

                } else {

                    tvResult.setText(
                            "Registration Successful!\n\n" +
                            "Name: " + name +
                            "\nEmail: " + email +
                            "\nCourse: " + course
                    );

                    Toast.makeText(
                            MainActivity.this,
                            "Registration Successful",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}