package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_delivery.Code_verfifcation_Activity;
import com.example.eldelivery.pojo_delivery.NewPasswordActivity;

public class Code_Verification_User_Activity extends AppCompatActivity {

    private ImageView back;
    private Button recover_pass_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_code_user);

        back=findViewById(R.id.back_code_verification_user);
        recover_pass_btn=findViewById(R.id.password_recovery_btn_user);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recover_pass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Code_Verification_User_Activity.this, NewPassword_user.class));
            }
        });

    }
}