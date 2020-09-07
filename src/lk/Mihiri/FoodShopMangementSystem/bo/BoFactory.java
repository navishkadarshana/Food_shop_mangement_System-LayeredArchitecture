/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.bo;

import lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl.CustomerBoImpl;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl.ItemBoImpl;
import lk.Mihiri.FoodShopMangementSystem.bo.Custom.Impl.PurchaseOrderBOImpl;

/**
 *
 * @author navis
 */
public class BoFactory {
   
      private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public enum BOTypes {
        CUSTOMER, ITEM, PURCHASEORDER
    }

    public SuperBo getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBoImpl();
            case ITEM:
                return new ItemBoImpl();
            case PURCHASEORDER:
                return new PurchaseOrderBOImpl();
            default:
                return null;

        }
    }
    
}
