package com.ho.cm.dao;

import com.ho.cm.common.ConnectionFactory;
import com.ho.cm.common.Queries;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;


public class UserDaoImp implements UserDao {
    public UserDaoImp() {
        super();
    }

    @Override
    public boolean passwordChecke(String password) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.PASSWORD_CHECK);
            jdbc.setString(1, password);
            jdbc.execute();
            if (jdbc.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean usernameCheck(String username) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.USERNAME_CHECK);
            jdbc.setString(1, username);
            jdbc.execute();
            if (jdbc.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updatePassword(String password) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.PASSWORD_UPDATE);
            jdbc.setString(1, password);
            jdbc.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean updateUsername(String username) {

        try (JdbcRowSet jdbc = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbc.setUrl(ConnectionFactory.getUrl());
            jdbc.setUsername(ConnectionFactory.getUsername());
            jdbc.setPassword(ConnectionFactory.getPassword());
            jdbc.setCommand(Queries.USERNAME_UPDATE);
            jdbc.setString(1, username);
            jdbc.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
}
