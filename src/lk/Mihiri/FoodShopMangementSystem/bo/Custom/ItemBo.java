/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom;

import lk.Mihiri.FoodShopMangementSystem.bo.SuperBo;
import lk.Mihiri.FoodShopMangementSystem.dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;

/**
 *
 * @author navis
 */
public interface ItemBo extends SuperBo{
    
    public boolean addItem(ItemDTO item) throws ClassNotFoundException, SQLException;
    
    public boolean updateItem(ItemDTO item) throws ClassNotFoundException, SQLException;
    
    public boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException;
    
    public Item searchItem(String itemCode) throws ClassNotFoundException, SQLException;
    
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException;
    
}
