/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom;

import lk.Mihiri.FoodShopMangementSystem.dao.CRUDDao;
import lk.Mihiri.FoodShopMangementSystem.entity.Order;

/**
 *
 * @author sanu
 */
public interface OrderDAO extends CRUDDao<Order, String>{
    
     public String generateOrderId() throws Exception;
    
}
