package com.example.eldelivery.pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class Mobilenumber_verification_signup extends AppCompatActivity {

    private Button send_code;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_phone_signup);

        send_code=findViewById(R.id.mobilenumber_signup_send_code);
        back=findViewById(R.id.back_mobile_number_signup);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(Mobilenumber_verification_signup.this,Code_verification_signup.class));
            }
        });
    }
}