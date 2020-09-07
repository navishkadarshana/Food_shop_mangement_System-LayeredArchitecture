/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom.impl;

import lk.Mihiri.FoodShopMangementSystem.dao.custom.OrderDAO;
import lk.Mihiri.FoodShopMangementSystem.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Order;

/**
 *
 * @author sanu
 */
public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean add(Order enty) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Orders values(?,?,?)", enty.getOid(), enty.getDate(), enty.getCustomerID());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from Orders where id=?");
    }

    @Override
    public boolean update(Order enty) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("Update Orders set date=?,customerId=? where id=?", enty.getDate(), enty.getCustomerID(), enty.getOid());
    }

    @Override
    public Order search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from Orders where id=?", id);
        if (rst.next()) {
            String oid = rst.getString(1);
            String date = rst.getString(2);
            String customerID = rst.getString(3);
         
            return new Order(oid, date, customerID);
        }
        return null;
    }

    @Override
    public ArrayList<Order> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from Orders");
        ArrayList<Order> allOrders = new ArrayList<>();
        while (rst.next()) {
            String oid = rst.getString(1);
            String date = rst.getString(2);
            String customerID = rst.getString(3);
            
            Order order = new Order(oid, date, customerID);
            allOrders.add(order);

        }
        return allOrders;
    }

    @Override
    public String generateOrderId() throws Exception {
         Connection connection = DBConnection.getnstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM Orders ORDER BY id DESC LIMIT 1");

        if (rst.next()) {
            String orderID = rst.getString(1);
            orderID = orderID.split("[A-Z]")[1];
            orderID = (Integer.parseInt(orderID) + 1) + "";
            return "D" + orderID;
        } else {
            return "D1";
        }
    }

}
