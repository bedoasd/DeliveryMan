package com.example.eldelivery.pojo_delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class MobileNumber_verification extends AppCompatActivity {

    private ImageView back;
    private Button send_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_phone);

        back=findViewById(R.id.back_mobile_number);
        send_code=findViewById(R.id.mobilenumber_send_code);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MobileNumber_verification.this,Code_verfifcation_Activity.class));
            }
        });


    }
}