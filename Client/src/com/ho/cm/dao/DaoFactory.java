package com.ho.cm.dao;


public class DaoFactory {
    // this factory to create all objectes wich
    public BillDao createBillRowDao() {
        return new BillDaoImp();
    }

    public UserDao createUserDao() {
        return new UserDaoImp();
    }

    public StockItemDao createstockItemDao() {
        return new StockItemDaoImp();
    }

}
