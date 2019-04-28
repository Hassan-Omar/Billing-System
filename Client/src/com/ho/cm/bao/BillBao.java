package com.ho.cm.bao;

import com.ho.cm.dto.BillDto;

import java.util.List;

public interface BillBao {
    // save the bill content 
    public boolean saveBill(BillDto bill);
    
    // searching for a bill by the customer name 
    public List<BillDto> searchBill(String customerName);
    
    // delete a bill using it's id 
    public boolean deletebill (int billId) ; 
    
    // list All bills 
    public List<BillDto> getAllBills();
    
    
    // view bill
    public BillDto viewBill(int billId);
}
