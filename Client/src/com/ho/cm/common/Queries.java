package com.ho.cm.common;


public class Queries {


    //_____________________________ USER ________________________________
    public static final String PASSWORD_CHECK = "SELECT PASSWORD FROM USER_TABLE WHERE PASSWORD = ?";

    public static final String USERNAME_CHECK = "SELECT USERNAME FROM USER_TABLE WHERE USERNAME = ?";

    public static final String PASSWORD_UPDATE = "UPDATE USER_TABLE SET PASSWORD = ? WHERE ID = 1";

    public static final String USERNAME_UPDATE = "UPDATE USER_TABLE SET USERNAME = ? WHERE ID = 1 ";
    //___________________________________________________________________



    //____________________________ BILL _________________________________
    public static final String INSERT_BILL = "INSERT INTO BILL (CUSTOMER_NAME,CUSTOMER_PHONE,B_DATE) VALUES(?,?,?)";

    public static final String DELETE_BILL = "DELETE FROM BILL WHERE ID = ?";

    public static final String SEARCH_BILL = "SELECT * FROM BILL WHERE LOWER(CUSTOMER_NAME) LIKE ?";

    public static final String GET_ALL_BILLS = "SELECT * FROM BILL";

    public static final String SAVE_ROW = "INSERT INTO BILL_ITEMS (ITEM_NAME,BILL_ID,SOlED_NUMBER) VALUES(?,?,?)";

    public static final String VIEW_BILL = "SELECT * FROM BILL JOIN BILL_ITEMS ON BILL.ID=? AND BILL_ITEMS.BILL_ID= ?";
    //____________________________________________________________________


    //____________________________ STOCK ITEM ____________________________
    public static final String INSERT_ITEM = "INSERT INTO ITEM (PRICE,CURRENT_NUMBER,ITEM_NAME) VALUES(?,?,?)";

    public static final String DELETE_ITEM = "DELETE FROM ITEM WHERE ID = ?";

    public static final String SEARCH_ITEM = "SELECT * FROM ITEM WHERE LOWER(ITEM_NAME) LIKE ?";

    public static final String GET_ALL_ITEMS = "SELECT * FROM ITEM";

    public static final String UPDATE_ITEM = "UPDATE ITEM SET  PRICE = ?, CURRENT_NUMBER = ?  WHERE ID = ?";

    public static final String ITEM_NUM_DEC =
        "UPDATE ITEM SET CURRENT_NUMBER = ITEM.CURRENT_NUMBER - ? WHERE ITEM_NAME = ?";
    //____________________________________________________________________

}
