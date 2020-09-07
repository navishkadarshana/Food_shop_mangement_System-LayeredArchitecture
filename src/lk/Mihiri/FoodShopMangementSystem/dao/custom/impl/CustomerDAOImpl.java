/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom.impl;

import lk.Mihiri.FoodShopMangementSystem.dao.custom.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Customer;

/**
 *
 * @author sanu
 */
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(Customer e) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Customer values(?,?,?,?)", e.getCid(), e.getName(), e.getContacts(), e.getAddress());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String sql = "Delete from Customer where cid=?";
        return CrudUtil.executeUpdate(sql, id);
    }

    @Override
    public boolean update(Customer e) throws SQLException, ClassNotFoundException {
        String sql = "Update Customer set name=?,contct=? ,address=? where cid=?";
        return CrudUtil.executeUpdate(sql, e.getName(), e.getContacts(), e.getAddress(), e.getCid());
    }

    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * from Customer where cid=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
        if (rst.next()) {
            String cusID = rst.getString(1);
            String cusName = rst.getString(2);
            String contact = rst.getString(3);
            String cusAddress = rst.getString(4);
            
            return new Customer(cusID, cusName, contact, cusAddress);

        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {

        String sql = "Select * from Customer";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            
            String cusID = rst.getString(1);
            String cusName = rst.getString(2);
            String contact = rst.getString(3);
            String cusAddress = rst.getString(4);

            Customer customer = new Customer(cusID, cusName, contact, cusAddress);
            allCustomers.add(customer);
        }
        return allCustomers;
    }

    @Override
    public String getCustomerLastID(String id) throws Exception {
        return null;
    }

    @Override
    public Customer searchContact(String contct) throws Exception {
     String sql = "Select * from Customer where contct=?";
        ResultSet rst = CrudUtil.executeQuery(sql, contct);
        if (rst.next()) {
            String cusID = rst.getString(1);
            String cusName = rst.getString(2);
            String contact = rst.getString(3);
            String cusAddress = rst.getString(4);
            
            return new Customer(cusID, cusName, contact, cusAddress);

        }
        return null;   
    }
}
