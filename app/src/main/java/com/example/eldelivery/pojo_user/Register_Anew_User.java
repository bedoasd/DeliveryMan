package com.example.eldelivery.pojo_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eldelivery.R;

public class Register_Anew_User extends AppCompatActivity {

    private ImageView back;
    private Button make_request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_anew_user);

        back=findViewById(R.id.back_make_request);
        make_request=findViewById(R.id.make_request_user);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        make_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register_Anew_User.this,MainActivity_user.class));
            }
        });

    }
}