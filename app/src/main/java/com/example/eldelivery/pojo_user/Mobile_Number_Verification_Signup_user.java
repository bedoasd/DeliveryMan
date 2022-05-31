package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_delivery.Code_verification_signup;
import com.example.eldelivery.pojo_delivery.Mobilenumber_verification_signup;

public class Mobile_Number_Verification_Signup_user extends AppCompatActivity {

    private Button send_code;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_phone_signup_user);


        send_code=findViewById(R.id.mobilenumber_signup_send_code_user);
        back=findViewById(R.id.back_mobile_number_signup_user);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mobile_Number_Verification_Signup_user.this, Code_Verfication_signup_user.class));
            }
        });

    }
}