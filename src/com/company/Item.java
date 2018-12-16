/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: Item.java
*////////////////////////////////////////////////////////////////////////////////////
package com.company;

import java.util.Date;

public interface Item {
    //Define all the methods in the interface
    String manufacturer = "OracleProduction";

    void setProductionNumber(int P);

    void setName(String N);

    String getName();

    Date getManufactureDate();

    int getSerialNumber(int S);

}
