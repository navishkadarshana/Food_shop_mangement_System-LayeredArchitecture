/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom;

import lk.Mihiri.FoodShopMangementSystem.bo.SuperBo;
import lk.Mihiri.FoodShopMangementSystem.dto.CustomerDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.ItemDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.OrderDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.OrderDetailDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;
import lk.Mihiri.FoodShopMangementSystem.entity.Order;
import lk.Mihiri.FoodShopMangementSystem.entity.OrderDetail;

/**
 *
 * @author sanu
 */
public interface PurchaseOrderBO extends SuperBo{

   public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    public boolean purchaseOrder(OrderDTO order) throws ClassNotFoundException, SQLException;
    
    public void getOrderDetailsForOID(String oid)throws ClassNotFoundException, SQLException;
   
    public boolean removeOrder(String id) throws ClassNotFoundException, SQLException;
    
    public ArrayList<OrderDTO> getAllOrder() throws ClassNotFoundException, SQLException;
    
    public boolean updateOrder(OrderDTO order) throws ClassNotFoundException, SQLException ;
    
    public  String generateOrderId() throws ClassNotFoundException, SQLException, Exception;
}
