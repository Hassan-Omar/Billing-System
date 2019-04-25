package com.ho.cm.dao;

import com.ho.cm.dto.StockItemDto;

import java.util.Collections;
import java.util.List;

public class StockItemDaoImp implements StockItemDao {
    public StockItemDaoImp() {
        super();
    }

    @Override
    public boolean saveStockItem(StockItemDto item) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<StockItemDto> searchItem(String itemName) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean deleteItem(int itemlId) {
        // TODO Implement this method
        return false;
    }
}
