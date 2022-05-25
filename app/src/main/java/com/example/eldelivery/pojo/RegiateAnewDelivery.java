package com.example.eldelivery.pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class RegiateAnewDelivery extends AppCompatActivity {

    private ImageView back;
    private Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_anew_delivery);

        back=findViewById(R.id.back_newdeliver_signup);
        signup=findViewById(R.id.signup);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegiateAnewDelivery.this,Home_Delivery_Activity.class));
            }
        });

    }
}