package com.example.eldelivery.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eldelivery.Fragment.WallFragment;
import com.example.eldelivery.R;
import com.example.eldelivery.model.Wall_Delivery_Order_Model;
import com.example.eldelivery.pojo_delivery.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

 public class WallDeliveryOrderAdapter extends RecyclerView.Adapter<WallDeliveryOrderAdapter.MyViewHolder> {
    private List<Wall_Delivery_Order_Model> orders_list=new ArrayList<>();
    private WallFragment mfragment;


     public WallDeliveryOrderAdapter(ArrayList<Wall_Delivery_Order_Model> orders_list, WallFragment wallFragment) {
         this.orders_list = orders_list;
         this.mfragment = wallFragment;
     }

     @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wall_requests, parent, false));

    }

     @Override
     public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

         holder.name.setText(orders_list.get(position).getName());
         holder.from.setText(orders_list.get(position).getFrom());
         holder.to.setText(orders_list.get(position).getTo());
         holder.price.setText(orders_list.get(position).getPrice());

         holder.acceptedbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Intent intent=new Intent(mfragment.getActivity(), DetailsActivity.class);
                mfragment.startActivity(intent);

             }
         });

     }


  /*  @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if(newsViewModel==null){
            newsViewModel=new ViewModelProvider((ViewModelStoreOwner) recyclerView.getContext()).get(NewsViewModel.class);
        }
    }*/


    @Override
    public int getItemCount() {
        return orders_list.size();
    }

/*    public void setList(List<> modelList) {
        this.newsList = modelList;
        notifyDataSetChanged();
    }*/

    /*public NewsModel getNewsAt(int position) {
        return newsList.get(position);

    }*/

   /* public NewsModel getSelectedMovie(int position){

        if(newsList!=null){
            if( newsList.size()>0){
                return newsList.get(position);
            }
        }
        return null;

    }*/


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView from;
        TextView to;
        TextView price;
        Button acceptedbtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.order_D_name);
            from = itemView.findViewById(R.id.order_D_from);
            to = itemView.findViewById(R.id.order_D_to);
            price = itemView.findViewById(R.id.order_D_price);
            acceptedbtn = itemView.findViewById(R.id.Acceptedbtn);


        }
    }
}