package com.ho.cm.dao;

import com.ho.cm.common.ConnectionFactory;
import com.ho.cm.common.Queries;
import com.ho.cm.dto.StockItemDto;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class StockItemDaoImp implements StockItemDao {


    @Override
    public boolean saveStockItem(StockItemDto item) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.INSERT_ITEM);

            jdbc.setFloat(1, item.getPrice()); // set the item price
            jdbc.setInt(2, item.getCurrentNumber()); // set the available number of items
            jdbc.setString(3, item.getName());
            jdbc.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    

    @Override
    public List<StockItemDto> searchItem(String itemName) {
        List<StockItemDto> items = null;
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.SEARCH_ITEM);
            jdbc.setString(1, '%' + itemName.toLowerCase().trim() + '%');
            
            jdbc.execute();

            while (jdbc.next()) {
                if (items == null)
                    items = new ArrayList<>();
                StockItemDto item = new StockItemDto();
                item.setId(jdbc.getInt(1));
                item.setPrice(jdbc.getFloat(2));
                item.setCurrentNumber(jdbc.getInt(3));
                item.setName(jdbc.getString(4));
                items.add(item);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }

    @Override
    public boolean deleteItem(int itemlId) {
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.DELETE_ITEM);
            jdbc.setInt(1, itemlId);
            jdbc.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<StockItemDto> getAllItems() {
        List<StockItemDto> items = null;
        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.GET_ALL_ITEMS);
            jdbc.execute();

            while (jdbc.next()) {
                if (items == null)
                    items = new ArrayList<>();
                
                StockItemDto item = new StockItemDto();
                // passing fields 
                item.setId(jdbc.getInt(1));
                item.setPrice(jdbc.getFloat(2));
                item.setCurrentNumber(jdbc.getInt(3));
                item.setName(jdbc.getString(4));
                
                items.add(item);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }

    @Override
    public boolean updateStockItem(StockItemDto item) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.UPDATE_ITEM);
           
            jdbc.setFloat(1, item.getPrice());
            jdbc.setInt(2,item.getCurrentNumber());
            jdbc.setInt(3, item.getId());
            jdbc.execute();
            return true ; 

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean decrementItemNum(StockItemDto item) {
        

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.ITEM_NUM_DEC);
           
            
            jdbc.setInt(1,item.getSoldNum());
            jdbc.setString(2 ,item.getName());
            jdbc.execute();
            return true ; 

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
