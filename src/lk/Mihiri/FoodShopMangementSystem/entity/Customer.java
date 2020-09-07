/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.entity;

/**
 *
 * @author sanu
 */
public class Customer {
    private String Cid;
    private String name;
    private String Contacts;
    private String address;

    public Customer() {
    }

    public Customer(String Cid, String name, String Contacts, String address) {
        this.Cid = Cid;
        this.name = name;
        this.Contacts = Contacts;
        this.address = address;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return Contacts;
    }

    public void setContacts(String Contacts) {
        this.Contacts = Contacts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "Cid=" + Cid + ", name=" + name + ", Contacts=" + Contacts + ", address=" + address + '}';
    }
    

  
    
    
    

   
    
    
    
}
