package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_delivery.DeliveryloginActivity;
import com.example.eldelivery.pojo_delivery.MobileNumber_verification;
import com.example.eldelivery.pojo_delivery.Mobilenumber_verification_signup;

public class User_Login extends AppCompatActivity {

    private ImageView back;
    private TextView forgotpassword;
    private TextView signuptxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        back=findViewById(R.id.back_user_login);
        forgotpassword=findViewById(R.id.forgotpassword_user_login);
        signuptxt=findViewById(R.id.signuptxt_user_version);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Login.this, Mobile_mumber_verification_User.class));
            }
        });
        signuptxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Login.this, Mobilenumber_verification_signup.class));
            }
        });

    }
}