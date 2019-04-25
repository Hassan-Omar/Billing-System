package com.ho.cm.bao;

import com.ho.cm.dto.StockItemDto;

import java.util.List;

public interface StockItemBao {
    // save the StockItem content
    public boolean saveStockItem(StockItemDto item);

    // searching for an item by the customer name
    public List<StockItemDto> searchItem(String itemName);

    // delete a item using it's id
    public boolean deleteItem(int itemlId);
}