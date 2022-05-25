package com.example.eldelivery.pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class Code_verification_signup extends AppCompatActivity {

    private ImageView back;
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_code_next);

        back=findViewById(R.id.back_code_verification_signup);
        nextbtn=findViewById(R.id.nextbtn_signup);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Code_verification_signup.this,RegiateAnewDelivery.class));
            }
        });

    }
}