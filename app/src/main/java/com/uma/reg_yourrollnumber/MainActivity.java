package com.uma.reg_yourrollnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText roll, name, mail, phone, password;
    RadioButton male, female;
    Spinner branch;
    String gender;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.rollnumber);
        name = findViewById(R.id.name);
        mail = findViewById(R.id.email);
        phone = findViewById(R.id.phonenumber);
        password = findViewById(R.id.password);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        branch = findViewById(R.id.spbranch);

        send = findViewById(R.id.sendData);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  roll_number = roll.getText().toString();
                String student_name = name.getText().toString();
                String email = mail.getText().toString();
                String phone_number = phone.getText().toString();
                String pass = password.getText().toString();

                if(male.isChecked()) {
                    gender = male.getText().toString();
                }
                else if(female.isChecked()) {
                    gender = female.getText().toString();
                }

                String branches = branch.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                intent.putExtra("roll", roll_number);
                intent.putExtra("name", student_name);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone_number);
                intent.putExtra("pass", pass);
                intent.putExtra("gender", gender);
                intent.putExtra("branches", branches);
                startActivity(intent);
            }
        });
    }
}