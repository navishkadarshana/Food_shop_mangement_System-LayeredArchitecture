/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom;

import lk.Mihiri.FoodShopMangementSystem.dao.CRUDDao;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;

/**
 *
 * @author sanu
 */
public interface ItemDAO extends CRUDDao<Item, String>{
    public String getItemLastID()throws Exception;
    
  
}

