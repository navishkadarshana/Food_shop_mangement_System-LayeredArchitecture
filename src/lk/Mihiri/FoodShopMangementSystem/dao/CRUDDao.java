/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sanu
 */
public interface CRUDDao<T,ID> extends SuperDAO{
    public boolean add(T enty) throws ClassNotFoundException, SQLException;
    public boolean delete(ID id) throws ClassNotFoundException, SQLException;
    public boolean update(T enty) throws SQLException, ClassNotFoundException ;
    public T search(ID id) throws SQLException, ClassNotFoundException;
    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
}
