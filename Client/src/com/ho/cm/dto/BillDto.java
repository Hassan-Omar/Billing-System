package com.ho.cm.dto;

import java.util.Date;
import java.util.List;


public class BillDto {
    private String customerName, customerPhone ;
    private Date billDate;

    
    
    private int billID;

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getBillID() {
        return billID;
    }
    private List<BillRowDto> billRows;

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillRows(List<BillRowDto> billRows) {
        this.billRows = billRows;
    }

    public List<BillRowDto> getBillRows() {
        return billRows;
    }

}
