package com.ho.cm.dto;


public class BillDto {
   private String itemName , customerName ;
   private int numberofItemes;
   private float pricePerItem ;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setNumberofItemes(int numberofItemes) {
        this.numberofItemes = numberofItemes;
    }

    public int getNumberofItemes() {
        return numberofItemes;
    }

    public void setPricePerItem(float pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }
}
