package com.ho.cm.dao;

import com.ho.cm.common.ConnectionFactory;
import com.ho.cm.common.Queries;
import com.ho.cm.dto.BillDto;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class BillDaoImp implements BillDao {
    public BillDaoImp() {
        super();
    }


    @Override
    public boolean saveBillRows(BillDto bill) {


        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.INSERT_BILL);

            jdbc.setString(1, bill.getCustomerName()); // set customer full name
            jdbc.setString(2, bill.getCustomerPhone()); // set phon number 
            
            // set the bill date 
            if (bill.getBillDate() != null)
                            jdbc.setDate(3, new java.sql.Date(bill.getBillDate().getTime()));
                        else
                            jdbc.setNull(3, java.sql.Types.DATE);
            jdbc.execute();
            return true; 
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
    public List<BillDto> searchBill(String customerName) {

        List<BillDto> bills = null;
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setString(1,customerName);
            jdbc.setCommand(Queries.SEARCH_BILL);
            jdbc.execute();

            while (jdbc.next()) {
                if (bills == null)
                    bills = new ArrayList<>();
                BillDto bill = new BillDto();
                bill.setBillID(jdbc.getInt(1));
                bill.setCustomerName(jdbc.getNString(2));
                bill.setCustomerPhone(jdbc.getNString(3));
                bill.setBillDate(jdbc.getDate(4));
                bills.add(bill);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bills;
    }

    @Override
    public boolean deleteBill(int billId) {
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.DELETE_BILL);
            jdbc.setInt(1, billId);
            jdbc.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<BillDto> getAllBills() {
        List<BillDto> bills = null;
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.GET_ALL_BILLS);
            jdbc.execute();

            while (jdbc.next()) {
                if (bills == null)
                bills = new ArrayList<>();
                BillDto bill = new BillDto();
                bill.setBillID(jdbc.getInt(1));
                bill.setCustomerName(jdbc.getNString(2));
                bill.setCustomerPhone(jdbc.getNString(3));
                bill.setBillDate(jdbc.getDate(4));
                bills.add(bill);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bills;
    }
}
