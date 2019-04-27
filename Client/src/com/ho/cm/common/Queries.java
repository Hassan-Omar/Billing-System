package com.ho.cm.common;


public class Queries {
   
   
    //_____________________________ USER ________________________________
   
   
   // INSERT INTO USER_TABLE (USERNAME,PASSWORD) VALUES('hassanomar','qazwsx') 
   // 
    public static final String PASSWORD_CHECK = "SELECT PASSWORD FROM USER_TABLE WHERE ID = 1";

    public static final String  USERNAME_CHECK = "SELECT USERNAME FROM USER_TABLE WHERE ID = 1";

    public static final String PASSWORD_UPDATE = "UPDATE USER_TABLE SET PASSWORD = ? WHERE ID = 1";

    public static final String USERNAME_UPDATE = "UPDATE USER_TABLE SET USERNAME = ? WHERE ID = 1 ";

    //___________________________________________________________________



    //____________________________ BILL _________________________________
	
    //INSERT INTO BILL (CUSTOMER_NAME,CUSTOMER_PHONE) VALUES('Hassan Omar','011345822345')
    public static final String INSERT_BILL ="INSERT INTO BILL (CUSTOMER_NAME,CUSTOMER_PHONE,B_DATE) VALUES(?,?,?)";

    public static final String DELETE_BILL = "DELETE FROM BILL WHERE ID = ?";

    public static final String SEARCH_BILL = "SELECT * FROM BILL WHERE LOWER(CUSTOMER_NAME) LIKE ?";
    
    public static final String GET_ALL_BILLS  ="SELECT * FROM BILL" ;
    
    public static final String INSERT_BILL_CONTENT = " ";
    
    //____________________________________________________________________



    //____________________________ STOCK ITEM ____________________________
    
    public static final String INSERT_ITEM ="INSERT INTO ITEM (PRICE,CURRENT_NUMBER,ITEM_NAME) VALUES(?,?,?)";

    public static final String DELETE_ITEM = "DELETE FROM ITEM WHERE ID = ?";

    public static final String SEARCH_ITEM = "SELECT * FROM BILL WHERE LOWER(CUSTOMER_NAME) LIKE ?";
    
    public static final String GET_ALL_ITEMS  ="SELECT * FROM ITEM" ;
    
    public static final String UPDATE_ITEM = "UPDATE ITEM SET  PRICE = ?, CURRENT_NUMBER = ?,  WHERE ID = ?" ;
    
    public static final String ITEM_NUM_DEC="UPDATE ITEM SET CURRENT_NUMBER = ITEM.CURRENT_NUMBER - ? WHERE ITEM_NAME = ?";
    //____________________________________________________________________

}
