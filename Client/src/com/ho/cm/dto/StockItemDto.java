package com.ho.cm.dto;


public class StockItemDto {
    public void setSoldNum(int soldNum) {
        this.soldNum = soldNum;
    }

    public int getSoldNum() {
        return soldNum;
    }
    private int currentNumber, id, soldNum;
    private float price;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
