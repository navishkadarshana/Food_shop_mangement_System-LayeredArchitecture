/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.entity;

import java.util.ArrayList;

/**
 *
 * @author sanu
 */
public class Order {

    private String oid;
    private String date;
    private String customerID;
   

    public Order() {
    }

    public Order(String oid, String date, String customerID) {
        this.oid = oid;
        this.date = date;
        this.customerID = customerID;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Order{" + "oid=" + oid + ", date=" + date + ", customerID=" + customerID + '}';
    }

   

}
