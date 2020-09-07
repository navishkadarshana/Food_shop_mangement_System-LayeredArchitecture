/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dto;

/**
 *
 * @author navis
 */
public class CustomerDTO {
    private String customerID;
    private String customerName;
    private String customerContacts;
    private String customerAddress;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID, String customerName, String customerContacts, String customerAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContacts = customerContacts;
        this.customerAddress = customerAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContacts() {
        return customerContacts;
    }

    public void setCustomerContacts(String customerContacts) {
        this.customerContacts = customerContacts;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "customerID=" + customerID + ", customerName=" + customerName + ", customerContacts=" + customerContacts + ", customerAddress=" + customerAddress + '}';
    }
    
    
}
