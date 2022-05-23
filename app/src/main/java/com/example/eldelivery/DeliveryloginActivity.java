package com.example.eldelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DeliveryloginActivity extends AppCompatActivity {

    private ImageView back;
    private TextView forgotpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_login);

        back=findViewById(R.id.back_deliverylogin);
        forgotpassword=findViewById(R.id.forgotpassword_delivery_login);

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

    }
}