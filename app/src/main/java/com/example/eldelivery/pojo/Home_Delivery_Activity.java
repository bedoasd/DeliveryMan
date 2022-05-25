package com.example.eldelivery.pojo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.eldelivery.Fragment.AcceptedOrderFragment;
import com.example.eldelivery.Fragment.WallFragment;
import com.example.eldelivery.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Delivery_Activity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    Fragment selectedfragment=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);



    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){

                        case R.id.nav_wall :
                            selectedfragment=new WallFragment();
                            menuItem.setIcon(R.drawable.home2);
                            
                            break;


                        case R.id.nav_accepted :
                            selectedfragment=new AcceptedOrderFragment();
                            break;


                    }

                    if (selectedfragment!=null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container
                                ,selectedfragment).commit();
                    }

                    return true;

                }
            };
}