/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom;

import lk.Mihiri.FoodShopMangementSystem.bo.SuperBo;
import lk.Mihiri.FoodShopMangementSystem.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;

/**
 *
 * @author navis
 */
public interface CustomerBo extends SuperBo{
  
        public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;
            
        public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException; 
                
        public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException; 
                
        public Customer searchCustomer(String customerID) throws ClassNotFoundException, SQLException;
        
        public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException;
        
        public Customer searchContact(String contct) throws ClassNotFoundException, SQLException, Exception;





    
}
