 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl;

import lk.Mihiri.FoodShopMangementSystem.bo.Custom.PurchaseOrderBO;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;
import lk.Mihiri.FoodShopMangementSystem.entity.Order;
import lk.Mihiri.FoodShopMangementSystem.entity.OrderDetail;

/**
 *
 * @author sanu
 */
public class PurchaseOrderBOImpl implements PurchaseOrderBO{
    
    
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    OrderDAO orderDAO = (OrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
    OrderDetailsDAO orderDetailsDAO = (OrderDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAILS);

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
          ArrayList<Customer> all= customerDAO.getAll();
        ArrayList<CustomerDTO>  allCustomers =new ArrayList<>();
        
         for (Customer customer : all) {
             allCustomers.add(new CustomerDTO(customer.getCid(), customer.getName(), customer.getContacts(), customer.getAddress()));
         }
         
         return  allCustomers;
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {

        ArrayList<Item> all=itemDAO.getAll();
        ArrayList<ItemDTO>  allItem =new ArrayList<>();
        
         for (Item item : all) {
             allItem.add(new ItemDTO(item.getCode(), item.getName(), item.getQtyOnHand(), item.getUnitPrice()));
         }
         
         return  allItem;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
          
        Customer customer = customerDAO.search(id);
        return new CustomerDTO(customer.getCid(), customer.getName(), customer.getContacts(), customer.getAddress()); 
    }

    @Override
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        
        Item item = itemDAO.search(code);
        return new ItemDTO(item.getCode(), item.getName(), item.getQtyOnHand(), item.getUnitPrice()); 
    }

    @Override
    public boolean purchaseOrder(OrderDTO orderDTO) throws ClassNotFoundException, SQLException {
       
        Connection connection = DBConnection.getnstance().getConnection();
        connection.setAutoCommit(false);

        Order order = new Order(orderDTO.getOid(), orderDTO.getDate(), orderDTO.getCustomerID());
        
        boolean add = orderDAO.add(order);
        if (add) {
            for (OrderDetailDTO od : orderDTO.getOrderDetails()) {
                OrderDetail orderDetail = new OrderDetail(od.getOid(), od.getItemCode(), od.getQty(), od.getUnitPrice());
                boolean add1 = orderDetailsDAO.add(orderDetail);
                if (!add1) {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;

                }
            }

            connection.commit();
            connection.setAutoCommit(true);
            return true;
        }
        connection.rollback();
        connection.setAutoCommit(true);
        return false;
        
    }

    @Override
    public void getOrderDetailsForOID(String oid) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeOrder(String id) throws ClassNotFoundException, SQLException {
         return orderDAO.delete(id);
    }

    @Override
    public ArrayList<OrderDTO> getAllOrder() throws ClassNotFoundException, SQLException {
        
         ArrayList<Order> all=orderDAO.getAll();
        
        ArrayList<OrderDTO>  allOrder =new ArrayList<>();
        
         for (Order order : all) {
             allOrder.add(new OrderDTO(order.getOid(), order.getCustomerID(), order.getDate()));
         }
         
         return  allOrder;
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) throws ClassNotFoundException, SQLException {
     
        Order order =new Order(orderDTO.getOid(),orderDTO.getDate(),orderDTO.getCustomerID());
        
        return orderDAO.update(order);
    }
    
       @Override
    public String generateOrderId() throws ClassNotFoundException, SQLException, Exception {
       
        return orderDAO.generateOrderId();
    }

  

 
    
    

    
}
