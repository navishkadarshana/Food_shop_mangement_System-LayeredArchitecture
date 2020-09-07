/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.entity;

/**
 *
 * @author sanu
 */
public class Item {

    private String code;
    private String Name;
    private int qtyOnHand;
    private double unitPrice;

    public Item() {
    }

    public Item(String code, String Name, int qtyOnHand, double unitPrice) {
        this.code = code;
        this.Name = Name;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "code=" + code + ", Name=" + Name + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + '}';
    }

  

}
