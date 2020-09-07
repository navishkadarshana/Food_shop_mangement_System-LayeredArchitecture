/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.controller;

import lk.Mihiri.FoodShopMangementSystem.bo.BoFactory;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.ItemBo;
import lk.Mihiri.FoodShopMangementSystem.dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;

/**
 *
 * @author sanu
 */
public class ItemFormController {

    ItemBo itemBo = (ItemBo) BoFactory.getInstance().getBO(BoFactory.BOTypes.ITEM);

    public boolean addItem(ItemDTO item) throws ClassNotFoundException, SQLException {

       
        return itemBo.addItem(item);
    }

    public boolean updateItem(ItemDTO item) throws ClassNotFoundException, SQLException {
        return itemBo.updateItem(item);
    }

    public boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemBo.removeItem(itemCode);
    }

    public Item searchItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemBo.searchItem(itemCode);
    }

    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
        return itemBo.getAllItems();
    }
    
    
    
   
}
