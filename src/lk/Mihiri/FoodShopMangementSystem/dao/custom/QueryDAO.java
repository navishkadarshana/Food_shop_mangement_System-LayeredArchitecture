/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom;

import lk.Mihiri.FoodShopMangementSystem.dao.SuperDAO;
import java.sql.SQLException;

/**
 *
 * @author sanu
 */
public interface QueryDAO extends SuperDAO{
     public void getCustomersOrderDetails(String oid) throws ClassNotFoundException, SQLException;
}
