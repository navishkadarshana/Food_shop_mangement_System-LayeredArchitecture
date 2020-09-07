/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom.impl;

import lk.Mihiri.FoodShopMangementSystem.dao.custom.ItemDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.Mihiri.FoodShopMangementSystem.entity.Item;

/**
 *
 * @author sanu
 */
public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean add(Item item) throws ClassNotFoundException, SQLException {
        String sql = "insert into Item values(?,?,?,?)";
        return CrudUtil.executeUpdate(sql, item.getCode(), item.getName(), item.getQtyOnHand(), item.getUnitPrice());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String sql = "delete from Item where code=?";
        return CrudUtil.executeUpdate(sql, id);
    }

    @Override
    public boolean update(Item item) throws SQLException, ClassNotFoundException {
        String sql = "Update Item set description=?,qtyOnHand=?,unitPrice=? where code=?";
        return CrudUtil.executeUpdate(sql, item.getCode(), item.getName(), item.getQtyOnHand(), item.getUnitPrice());
    }

    @Override
    public Item search(String id) throws SQLException, ClassNotFoundException {
        String sql = "select * from Item where code=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
        if (rst.next()) {
            String code = rst.getString(1);
            String itemName = rst.getString(2);
            int qtyOnHand = rst.getInt(3);
            double unitPrice = rst.getDouble(4);
            return new Item(code, itemName, qtyOnHand, unitPrice);
        }
        return null;
    }

    @Override
    public ArrayList<Item> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from Item";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Item> allItmes = new ArrayList<>();
        while (rst.next()) {
            String code = rst.getString(1);
            String itemName = rst.getString(2);
            int qtyOnHand = rst.getInt(3);
            double unitPrice = rst.getDouble(4);
            Item item = new Item(code, itemName, qtyOnHand, unitPrice);
            allItmes.add(item);

        }
        return allItmes;
    }

    @Override
    public String getItemLastID() throws Exception {
        return null;
    }

   

  

}
