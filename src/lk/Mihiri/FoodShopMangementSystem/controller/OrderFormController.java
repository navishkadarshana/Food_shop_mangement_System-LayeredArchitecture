/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.controller;

import lk.Mihiri.FoodShopMangementSystem.bo.BoFactory;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.PurchaseOrderBO;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl.PurchaseOrderBOImpl;
import lk.Mihiri.FoodShopMangementSystem.dao.DAOFactory;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.CustomerDAO;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.ItemDAO;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.OrderDAO;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.OrderDetailsDAO;
import lk.Mihiri.FoodShopMangementSystem.db.DBConnection;
import lk.Mihiri.FoodShopMangementSystem.dto.CustomerDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.ItemDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.OrderDTO;
import lk.Mihiri.FoodShopMangementSystem.dto.OrderDetailDTO;
import java.sql.Connection;
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
public class OrderFormController {

     
     PurchaseOrderBO orderBO = (PurchaseOrderBO) BoFactory.getInstance().getBO(BoFactory.BOTypes.PURCHASEORDER);

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        return orderBO.getAllCustomers();
    }

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        return orderBO.getAllItems();
    }

    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
       
        return orderBO.searchCustomer(id);
    }

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        return orderBO.searchItem(code);
    }

     public boolean purchaseOrder(OrderDTO dto) throws ClassNotFoundException, SQLException {
        return orderBO.purchaseOrder(dto);

    }
    
    public  String generateOrderId() throws ClassNotFoundException, SQLException, Exception{
    
        return orderBO.generateOrderId();
    }
    
      public boolean removeOrder(String id) throws ClassNotFoundException, SQLException {
        return orderBO.removeOrder(id);
    }
      
    
     public ArrayList<OrderDTO> getAllOrder() throws ClassNotFoundException, SQLException {
        return orderBO.getAllOrder();
    }
     
      public boolean updateOrder(OrderDTO order) throws ClassNotFoundException, SQLException {
        return orderBO.updateOrder(order);
    }
      
     
     
     
     
     

}
