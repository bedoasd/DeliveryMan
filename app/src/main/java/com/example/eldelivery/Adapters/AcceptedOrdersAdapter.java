package com.example.eldelivery.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eldelivery.Fragment.AcceptedOrderFragment;
import com.example.eldelivery.R;
import com.example.eldelivery.model.Wall_Delivery_Order_Model;
import com.example.eldelivery.pojo_delivery.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

public class AcceptedOrdersAdapter extends RecyclerView.Adapter<AcceptedOrdersAdapter.MyViewHolder> {

    private List<Wall_Delivery_Order_Model>accepted_list=new ArrayList<>();
    private AcceptedOrderFragment accFragment;

    public AcceptedOrdersAdapter(List<Wall_Delivery_Order_Model> accepted_list, AcceptedOrderFragment accFragment) {
        this.accepted_list = accepted_list;
        this.accFragment = accFragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orders_accepted,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ordernumber.setText(accepted_list.get(position).getOrdernumber());
        holder.name.setText(accepted_list.get(position).getName());
        holder.orderDate.setText(accepted_list.get(position).getOrderDate());
        holder.the_order.setText(accepted_list.get(position).getThe_order());

        holder.detailsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(accFragment.getActivity(), DetailsActivity.class);
                accFragment.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return accepted_list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ordernumber;
        TextView name;
        TextView orderDate;
        TextView the_order;
        Button detailsbtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ordernumber = itemView.findViewById(R.id.order_number);
            name = itemView.findViewById(R.id.person_name);
            orderDate = itemView.findViewById(R.id.order_date);
            the_order = itemView.findViewById(R.id.the_order);
            detailsbtn = itemView.findViewById(R.id.details_btn);


        }
    }
}
