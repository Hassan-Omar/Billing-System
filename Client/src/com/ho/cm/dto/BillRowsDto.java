package com.ho.cm.dto;


public class BillRowsDto {
   
    private String itemName  ;
    private int numberofItemes;
    private float pricePerItem ;

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
