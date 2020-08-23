package com.uma.reg_yourrollnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView r, n, e, p, pas, g, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        r = findViewById(R.id.roll);
        n = findViewById(R.id.name);
        e = findViewById(R.id.mailid);
        p = findViewById(R.id.mobile);
        pas = findViewById(R.id.pass);
        g = findViewById(R.id.gender);
        b = findViewById(R.id.branch);

        String regno = getIntent().getStringExtra("roll");
        String Name = getIntent().getStringExtra("name");
        String Mail = getIntent().getStringExtra("email");
        String Mobile = getIntent().getStringExtra("phone");
        String Password = getIntent().getStringExtra("pass");
        String Gender = getIntent().getStringExtra("gender");
        String Branch = getIntent().getStringExtra("branches");

        r.setText(regno);
        n.setText(Name);
        e.setText(Mail);
        p.setText(Mobile);
        pas.setText(Password);
        g.setText(Gender);
        b.setText(Branch);

    }
}