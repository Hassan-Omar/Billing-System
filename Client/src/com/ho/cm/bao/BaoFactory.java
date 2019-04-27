package com.ho.cm.bao;


public class BaoFactory {
    // this factory  to create all business objects wich we need

    public BillBao createBillBao() {
        return new BillBaoImp();
    }

    public UserBao createUserBao() {
        return new UserBaoImp();
    }

    public StockItemBao createStockItemBao() {
        return new StockItemBaoImp();
    }

}
