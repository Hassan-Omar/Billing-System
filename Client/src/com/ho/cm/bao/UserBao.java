package com.ho.cm.bao;


public interface UserBao {

    // check if the password is true
    public boolean passwordChecke(String pass);

    // check if the userName is true
    public boolean usernameCheck(String username);

    // to update the password and this work only and if only is logged in
    public boolean updatePassword(String password);


    // to update the user name  and this work only and if only is logged in
    public boolean updateUsername(String username);
    
}
