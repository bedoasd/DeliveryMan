package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_delivery.Code_verfifcation_Activity;
import com.example.eldelivery.pojo_delivery.MobileNumber_verification;

public class Mobile_mumber_verification_User extends AppCompatActivity {

    private ImageView back;
    private Button send_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_user_phone);

        back=findViewById(R.id.back_mobile_number_user);
        send_code=findViewById(R.id.mobilenumber_user_send_code);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mobile_mumber_verification_User.this, Code_Verification_User_Activity.class));
            }
        });

    }
}