package com.example.eldelivery.pojo_delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class Code_verfifcation_Activity extends AppCompatActivity {

    private ImageView back;
    private Button recover_pass_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_code);

        back=findViewById(R.id.back_code_verification);
        recover_pass_btn=findViewById(R.id.password_recovery_btn);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recover_pass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Code_verfifcation_Activity.this,NewPasswordActivity.class));
            }
        });
    }
}