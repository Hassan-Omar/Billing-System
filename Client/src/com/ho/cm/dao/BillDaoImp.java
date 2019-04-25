package com.ho.cm.dao;

import com.ho.cm.dto.BillDto;

import java.util.Collections;
import java.util.List;

public class BillDaoImp implements BillDao {
    public BillDaoImp() {
        super();
    }

    @Override
    public boolean saveBillRows(BillDto  bill) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<BillDto> searchBill(String customerName) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean deletebill(int billId) {
        // TODO Implement this method
        return false;
    }
}
