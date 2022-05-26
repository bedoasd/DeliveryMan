package com.example.eldelivery.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.eldelivery.Adapters.WallDeliveryOrderAdapter;
import com.example.eldelivery.R;
import com.example.eldelivery.model.Wall_Delivery_Order_Model;

import java.util.ArrayList;

public class WallFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<Wall_Delivery_Order_Model>orders_list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_wall, container, false);






        recyclerView=view.findViewById(R.id.wall_orders_delivery_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        WallDeliveryOrderAdapter wallDeliveryOrderAdapter=new WallDeliveryOrderAdapter(orders_list,this);
        recyclerView.setAdapter(wallDeliveryOrderAdapter);


        orders_list.add(new Wall_Delivery_Order_Model("salama","cairo","alex","100","123456","20/04/2022","kilo potatos"));
        orders_list.add(new Wall_Delivery_Order_Model("ALi Ahmed ","shaikh khali","sa7ep el dewan","15","123456","20/04/2022","kilo potatos"));
        orders_list.add(new Wall_Delivery_Order_Model("omar","elshare3 el geded","el mahata","20","123456","20/04/2022","kilo potatos"));
        orders_list.add(new Wall_Delivery_Order_Model("mona","cairo","kafreldawar","56","123456","20/04/2022","kilo potatos"));
        orders_list.add(new Wall_Delivery_Order_Model("salwa","aswan","alex","1500","123456","20/04/2022","kilo potatos"));





        return view;
    }
}