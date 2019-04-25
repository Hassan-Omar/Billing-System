package com.ho.cm.dao;

import com.ho.cm.dto.StockItemDto;

import java.util.List;

public interface StockItemDao {
    // save the StockItem content 
    public boolean saveStockItem(StockItemDto item);
    
    // searching for an item by the customer name 
    public List<StockItemDto> searchItem(String itemName);
    
    // delete a item using it's id 
    public boolean deleteItem (int itemlId) ; 
}
