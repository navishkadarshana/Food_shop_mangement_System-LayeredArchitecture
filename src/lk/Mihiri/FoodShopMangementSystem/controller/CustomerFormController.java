/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.controller;

import lk.Mihiri.FoodShopMangementSystem.bo.BoFactory;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.CustomerBo;
import lk.Mihiri.FoodShopMangementSystem.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;

/**
 *
 * @author sanu
 */
public class CustomerFormController {

    CustomerBo customerBo = (CustomerBo) BoFactory.getInstance().getBO(BoFactory.BOTypes.CUSTOMER);


    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        
        return customerBo.addCustomer(customer);
    }

    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return customerBo.updateCustomer(customer);
    }

    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return customerBo.removeCustomer(customerID);
    }

    public Customer searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return customerBo.searchCustomer(customerID);
    }

    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        return customerBo.getAllCustomers();
    }
    
    public Customer searchContact(String contct) throws ClassNotFoundException, SQLException, Exception {
        return customerBo.searchContact(contct);
    }

}
