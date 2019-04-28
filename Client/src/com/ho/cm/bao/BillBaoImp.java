package com.ho.cm.bao;

import com.ho.cm.dao.BillDao;
import com.ho.cm.dao.DaoFactory;
import com.ho.cm.dao.StockItemDao;
import com.ho.cm.dto.BillDto;
import com.ho.cm.dto.BillRowDto;
import com.ho.cm.dto.StockItemDto;

import java.util.List;

public class BillBaoImp implements BillBao {
    StockItemDao stokItemDaoObj = new DaoFactory().createstockItemDao(); // create dao object
    BillDao billDaoObj = new DaoFactory().createBillRowDao(); // create dao object

    // only  we need to delegate all  methods in  Dao Object


    @Override
    public boolean saveBill(BillDto bill) {
        boolean status;
        status = billDaoObj.saveBill(bill);


        if (status) {
            List<BillRowDto> records = bill.getBillRows();

            StockItemDto item = new StockItemDto();

            // getting last id from bill table
            List<BillDto> bills = billDaoObj.getAllBills();
            int b_ID = bills.get(bills.size() - 1).getBillID(); // this is is the last id stored in bill table

            // loop on records to update available number
            for (int i = 0; i < records.size(); i++) {

                item.setSoldNum(records.get(i).getNumberofItemes());
                item.setName(records.get(i).getItemName()); // update by name
                stokItemDaoObj.decrementItemNum(item);
                // store row number i
                billDaoObj.saveRow(records.get(i), b_ID);

            }


        }

        return status;
    }

    @Override
    public List<BillDto> searchBill(String customerName) {

        return billDaoObj.searchBill(customerName);
    }

    @Override
    public boolean deletebill(int billId) {

        return billDaoObj.deleteBill(billId);
    }

    @Override
    public List<BillDto> getAllBills() {

        return billDaoObj.getAllBills();
    }


    @Override
    public BillDto viewBill(int billId) {

        return billDaoObj.viewBill(billId);
    }
}
