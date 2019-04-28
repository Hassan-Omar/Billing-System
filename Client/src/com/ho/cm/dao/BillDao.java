package com.ho.cm.dao;

import com.ho.cm.dto.BillDto;
import com.ho.cm.dto.BillRowDto;

import java.util.List;

public interface BillDao {
    // save the bill content 
    public boolean saveBill(BillDto bill);
    
    // searching for a bill by the customer name 
    public List<BillDto> searchBill(String customerName);
    
    // delete a bill using it's id 
    public boolean deleteBill (int billId) ; 
    
    // list All bills 
    public List<BillDto> getAllBills();
    
    // save rows of the bill 
    public boolean saveRow(BillRowDto row, int billID); 
    
    // view bill details 
    public BillDto viewBill (int billId);
}
