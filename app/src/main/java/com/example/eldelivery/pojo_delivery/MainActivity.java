package com.example.eldelivery.pojo_delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eldelivery.R;
import com.example.eldelivery.pojo_user.User_Login;

public class MainActivity extends AppCompatActivity {

    private Button user,delivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom);

        user=findViewById(R.id.user);
        delivery=findViewById(R.id.delivery);

        //user to user signed up
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, User_Login.class));
            }
        });

        //delivery btn to sign in as delivery
        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DeliveryloginActivity.class));
            }
        });

    }
}