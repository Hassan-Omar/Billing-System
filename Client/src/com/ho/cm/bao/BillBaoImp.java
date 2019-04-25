package com.ho.cm.bao;

import com.ho.cm.dao.BillDao;
import com.ho.cm.dao.DaoFactory;
import com.ho.cm.dto.BillDto;

import java.util.List;

public class BillBaoImp implements BillBao {

    BillDao billContentDaoObj = new DaoFactory().createBillRowDao(); // create dao object

    // only  we need to delegate all  methods in  Dao Object


    @Override
    public boolean saveBillRows(BillDto bill) {

        return billContentDaoObj.saveBillRows(bill);
    }

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
