package com.example.eldelivery.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eldelivery.Adapters.AcceptedOrdersAdapter;
import com.example.eldelivery.R;
import com.example.eldelivery.model.Wall_Delivery_Order_Model;

import java.util.ArrayList;
import java.util.List;

public class AcceptedOrderFragment extends Fragment {


    private RecyclerView recyclerView;
    private ArrayList<Wall_Delivery_Order_Model>Accepted_list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_accepted_order, container, false);


        Accepted_list.add(new Wall_Delivery_Order_Model("salama","cairo","alex","100","123456","20/04/2022","kilo potatos"));
        Accepted_list.add(new Wall_Delivery_Order_Model("ALi Ahmed ","shaikh khali","sa7ep el dewan","15","123456","20/04/2022","kilo potatos"));
        Accepted_list.add(new Wall_Delivery_Order_Model("omar","elshare3 el geded","el mahata","20","123456","20/04/2022","kilo potatos"));
        Accepted_list.add(new Wall_Delivery_Order_Model("mona","cairo","kafreldawar","56","123456","20/04/2022","kilo potatos"));
        Accepted_list.add(new Wall_Delivery_Order_Model("salwa","aswan","alex","1500","123456","20/04/2022","kilo potatos"));


        recyclerView=view.findViewById(R.id.recycler_accepted_orders);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AcceptedOrdersAdapter adapter=new AcceptedOrdersAdapter(Accepted_list,this);
        recyclerView.setAdapter(adapter);


        return view;

    }
}