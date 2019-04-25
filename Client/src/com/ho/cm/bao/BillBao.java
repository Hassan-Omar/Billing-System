package com.ho.cm.bao;

import com.ho.cm.dto.BillDto;

import java.util.List;

public interface BillBao {
    // save the bill content 
    public boolean saveBillRows(BillDto bill);
    
    // searching for a bill by the customer name 
    public List<BillDto> searchBill(String customerName);
    
    // delete a bill using it's id 
    public boolean deletebill (int billId) ; 
}
