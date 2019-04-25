package com.ho.cm.bao;

import com.ho.cm.dao.DaoFactory;
import com.ho.cm.dao.UserDao;

public class UserBaoImp implements UserBao {
    UserDao userDaoObj = new DaoFactory().createUserDao(); // create dao object
    // only  we need to delegate all  methods in  Dao Object

    @Override
    public boolean passwordChecke(String pass) {

        return userDaoObj.passwordChecke(pass);
    }

    @Override
    public boolean userName(String username) {

        return userDaoObj.usernameCheck(username);
    }

    @Override
    public boolean updatePassword(String password) {

        return userDaoObj.updatePassword(password);
    }

    @Override
    public boolean updateUsername(String username) {

        return userDaoObj.updateUsername(username);
    }
}
