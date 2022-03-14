package com.example.pertemuankeduaevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txEmail = findViewById(R.id.edAlamat);
        txPassword = findViewById(R.id.edPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");

        String pass = bundle.getString("b");

        txEmail.setText(email);
       txPassword.setText(pass);
 }
}