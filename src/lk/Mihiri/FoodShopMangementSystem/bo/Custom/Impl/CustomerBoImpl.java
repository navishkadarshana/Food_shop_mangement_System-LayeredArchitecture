/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl;

import lk.Mihiri.FoodShopMangementSystem.bo.Custom.CustomerBo;
import lk.Mihiri.FoodShopMangementSystem.dao.DAOFactory;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.CustomerDAO;
import lk.Mihiri.FoodShopMangementSystem.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;

/**
 *
 * @author navis
 */
public class CustomerBoImpl implements CustomerBo{
  
    
     CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);


     @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        Customer customer = new Customer(customerDTO.getCustomerID(), customerDTO.getCustomerName(), customerDTO.getCustomerContacts(), customerDTO.getCustomerAddress());
        return dao.add(customer);
    }

     @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        
        Customer customer = new Customer(customerDTO.getCustomerID(), customerDTO.getCustomerName(), customerDTO.getCustomerContacts(), customerDTO.getCustomerAddress());
        return dao.update(customer);
    }

     @Override
    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return dao.delete(customerID);
    }

     @Override
    public Customer searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return dao.search(customerID);
    }

     @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> all=dao.getAll();
        ArrayList<CustomerDTO>  allCustomers =new ArrayList<>();
        
         for (Customer customer : all) {
             allCustomers.add(new CustomerDTO(customer.getCid(), customer.getName(), customer.getContacts(), customer.getAddress()));
         }
         
         return  allCustomers;
        
        
    }
    
     @Override
    public Customer searchContact(String contct) throws ClassNotFoundException, SQLException, Exception {
        return dao.searchContact(contct);
    }
    
    
}
