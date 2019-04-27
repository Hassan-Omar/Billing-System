package com.ho.cm.bao;

import com.ho.cm.dao.DaoFactory;
import com.ho.cm.dao.StockItemDao;
import com.ho.cm.dto.StockItemDto;

import java.util.List;

public class StockItemBaoImp implements StockItemBao {
    
    StockItemDao stokItemDaoObj = new DaoFactory().createstockItemDao(); // create dao object 
    // only  we need to delegate all  methods in  Dao Object
    
   
    @Override
    public  List<StockItemDto>  allItem() {
        return stokItemDaoObj.getAllItems();
    }
    
    @Override
    public boolean saveStockItem(StockItemDto item) {
        return stokItemDaoObj.saveStockItem(item);
    }

    @Override
    public List<StockItemDto> searchItem(String itemName) {

        return stokItemDaoObj.searchItem(itemName);
    }

    @Override
    public boolean deleteItem(int itemlId) {
        return stokItemDaoObj.deleteItem(itemlId);
    }
}
