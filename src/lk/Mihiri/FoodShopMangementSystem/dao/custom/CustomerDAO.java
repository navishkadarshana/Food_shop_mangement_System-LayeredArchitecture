/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom;

import lk.Mihiri.FoodShopMangementSystem.dao.CRUDDao;
import java.sql.SQLException;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;

/**
 *
 * @author sanu
 */
public interface CustomerDAO extends CRUDDao<Customer, String>{
    public String getCustomerLastID(String id)throws Exception;
    
    public Customer searchContact(String contct) throws Exception;
}
