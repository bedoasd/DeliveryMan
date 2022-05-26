package com.example.eldelivery.model;

import android.os.Parcel;

import androidx.annotation.NonNull;

public class Wall_Delivery_Order_Model {
    private String name;
    private String from;
    private String to;
    private String price;
    private String ordernumber;
    private String orderDate;
    private String the_order;

    public Wall_Delivery_Order_Model(String name, String from, String to, String price, String ordernumber, String orderDate, String the_order) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.price = price;
        this.ordernumber = ordernumber;
        this.orderDate = orderDate;
        this.the_order = the_order;
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

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getThe_order() {
        return the_order;
    }

    public void setThe_order(String the_order) {
        this.the_order = the_order;
    }
}
