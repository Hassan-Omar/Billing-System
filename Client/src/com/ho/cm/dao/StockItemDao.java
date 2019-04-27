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
    
    //list all items 
    public List<StockItemDto> getAllItems ();
    
    // update the item content like price and each available number 
    public boolean updateStockItem(StockItemDto item);
    
    // this only to update current number 
    public boolean decrementItemNum(StockItemDto item);
    
}
