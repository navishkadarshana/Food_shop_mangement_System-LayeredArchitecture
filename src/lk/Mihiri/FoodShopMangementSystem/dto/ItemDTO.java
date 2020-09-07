/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dto;

/**
 *
 * @author navis
 */
public class ItemDTO {
    private String Itemcode;
    private String ItemName;
    private int ItemqtyOnHand;
    private double ItemunitPrice;  

    public ItemDTO() {
    }

    public ItemDTO(String Itemcode, String ItemName, int ItemqtyOnHand, double ItemunitPrice) {
        this.Itemcode = Itemcode;
        this.ItemName = ItemName;
        this.ItemqtyOnHand = ItemqtyOnHand;
        this.ItemunitPrice = ItemunitPrice;
    }

    public String getItemcode() {
        return Itemcode;
    }

    public void setItemcode(String Itemcode) {
        this.Itemcode = Itemcode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getItemqtyOnHand() {
        return ItemqtyOnHand;
    }

    public void setItemqtyOnHand(int ItemqtyOnHand) {
        this.ItemqtyOnHand = ItemqtyOnHand;
    }

    public double getItemunitPrice() {
        return ItemunitPrice;
    }

    public void setItemunitPrice(double ItemunitPrice) {
        this.ItemunitPrice = ItemunitPrice;
    }

    @Override
    public String toString() {
        return "ItemDTO{" + "Itemcode=" + Itemcode + ", ItemName=" + ItemName + ", ItemqtyOnHand=" + ItemqtyOnHand + ", ItemunitPrice=" + ItemunitPrice + '}';
    }
    
    

    
    
    
    
}
