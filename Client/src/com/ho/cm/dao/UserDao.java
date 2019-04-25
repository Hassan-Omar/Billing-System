package com.ho.cm.dao;


public interface UserDao {
    // check if the password is true 
    public boolean passwordChecke (String pass);
    
    // check if the userName is true 
    public boolean userName (String username);
    
    // to update the password and this work only and if only is logged in 
    public boolean updatePassword (int billId) ; 
    
    
    // to update the user name  and this work only and if only is logged in 
    public boolean updateUsername (int billId) ; 
}
