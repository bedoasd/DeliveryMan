package com.example.eldelivery.pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eldelivery.R;

public class DeliveryloginActivity extends AppCompatActivity {

    private ImageView back;
    private TextView forgotpassword;
    private TextView signuptxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_login);

        back=findViewById(R.id.back_deliverylogin);
        forgotpassword=findViewById(R.id.forgotpassword_delivery_login);
        signuptxt=findViewById(R.id.signuptxt_deliver_version);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeliveryloginActivity.this,MobileNumber_verification.class));
            }
        });
        signuptxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeliveryloginActivity.this,Mobilenumber_verification_signup.class));
            }
        });



    }
}