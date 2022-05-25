package com.example.eldelivery.model;

import android.os.Parcel;

import androidx.annotation.NonNull;

public class Wall_Delivery_Order_Model {
    private String name;
    private String from;
    private String to;
    private String price;

    public Wall_Delivery_Order_Model(String name, String from, String to, String price) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.price = price;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




}
