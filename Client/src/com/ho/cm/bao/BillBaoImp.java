package com.ho.cm.bao;

import com.ho.cm.dao.BillDao;
import com.ho.cm.dao.DaoFactory;
import com.ho.cm.dao.StockItemDao;
import com.ho.cm.dto.BillDto;
import com.ho.cm.dto.BillRowsDto;
import com.ho.cm.dto.StockItemDto;

import java.util.List;

public class BillBaoImp implements BillBao {
    StockItemDao stokItemDaoObj = new DaoFactory().createstockItemDao(); // create dao object 
    BillDao billContentDaoObj = new DaoFactory().createBillRowDao(); // create dao object

    // only  we need to delegate all  methods in  Dao Object


    @Override
    public boolean saveBillRows(BillDto bill  ) {
        boolean status ; 
        status =  billContentDaoObj.saveBillRows(bill);
        if(status)
        {List<BillRowsDto> records = bill.getBillRows();
            StockItemDto item =new  StockItemDto() ;
            for (int i = 0  ;i<records.size() ; i++)
            {item.setSoldNum(records.get(i).getNumberofItemes()); // this need a global var 
                item.setName(records.get(i).getItemName()); // update by name 
            stokItemDaoObj.updateStockItem(item);
                }
        }
        
    return status ; }

    @Override
    public List<BillDto> searchBill(String customerName) {

        return billContentDaoObj.searchBill(customerName);
    }

    @Override
    public boolean deletebill(int billId) {

        return billContentDaoObj.deleteBill(billId);
    }

    @Override
    public List<BillDto> getAllBills() {

        return billContentDaoObj.getAllBills();
    }
}
