package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_delivery.RegiateAnewDelivery;

public class Code_Verfication_signup_user extends AppCompatActivity {


    private Button nextbtn;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_code_next_user);

        nextbtn=findViewById(R.id.nextbtn_signup_user);
        back=findViewById(R.id.back_code_verification_signup_user);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(Code_Verfication_signup_user.this, RegiateAnewDelivery.class));
            }
        });

    }
}