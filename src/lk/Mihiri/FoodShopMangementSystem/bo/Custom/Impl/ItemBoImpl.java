/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl;

import lk.Mihiri.FoodShopMangementSystem.bo.BoFactory;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.CustomerBo;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.ItemBo;
import lk.Mihiri.FoodShopMangementSystem.dao.DAOFactory;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.ItemDAO;
import lk.Mihiri.FoodShopMangementSystem.dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;

/**
 *
 * @author navis
 */
public class ItemBoImpl implements ItemBo{
    
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
     
     
    @Override
    public boolean addItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
       
        Item item =new Item(itemDTO.getItemcode(),itemDTO.getItemName(),itemDTO.getItemqtyOnHand(),itemDTO.getItemqtyOnHand());
        return itemDAO.add(item);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
        
        Item item =new Item(itemDTO.getItemcode(),itemDTO.getItemName(),itemDTO.getItemqtyOnHand(),itemDTO.getItemqtyOnHand());
        return itemDAO.update(item);
    }

    @Override
    public boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemDAO.delete(itemCode);
    }

    @Override
    public Item searchItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemDAO.search(itemCode);
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
       ArrayList<Item> all=itemDAO.getAll();
        ArrayList<ItemDTO>  allItem =new ArrayList<>();
        
         for (Item item : all) {
             allItem.add(new ItemDTO(item.getCode(), item.getName(), item.getQtyOnHand(), item.getUnitPrice()));
         }
         
         return  allItem;
        
    }

  
    
}
