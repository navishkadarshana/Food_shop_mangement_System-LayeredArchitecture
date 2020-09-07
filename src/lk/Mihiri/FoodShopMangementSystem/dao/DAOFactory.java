/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao;

import lk.Mihiri.FoodShopMangementSystem.dao.custom.impl.CustomerDAOImpl;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.impl.ItemDAOImpl;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.impl.OrderDAOImpl;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.impl.OrderDetailsDAOImpl;
import lk.Mihiri.FoodShopMangementSystem.dao.custom.impl.QueryDAOImpl;

/**
 *
 * @author sanu
 */
public class DAOFactory {

    private static DAOFactory dAOFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            dAOFactory = new DAOFactory();
        }

        return dAOFactory;
    }
    
    public enum DAOTypes {
        CUSTOMER, ITEM, ORDERS, ORDERDETAILS, QUERYDAO;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDERS:
                return new OrderDAOImpl();
            case ORDERDETAILS:
                return new OrderDetailsDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            default:
                return null;
        }

    }

}
