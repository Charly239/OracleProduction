package com.company;
/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: com.company.Product.java
  Description: This program implements the com.company.Item.Java interface to a create a com.company.Product
  that will be manufactured. The item created will have the features of
  + The manufacturer of the product
  + Name
  + Serial Number
  + Date it was manufactured
*////////////////////////////////////////////////////////////////////////////////////
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;
    private static int currentProductionNumber = 1;

    public Product(String N){
    name = N;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
    }


    public void setProductionNumber(int P){
        currentProductionNumber = P;
    }

    public void setName(String N) {
        name = N;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber(int s) {
        return serialNumber;
    }

    public String toString() {
        return ("Manufacturer : " + manufacturer + "\n"
                + "Serial Number  : " + serialNumber + "\n"
                + "Date : " + manufacturedOn + "\n"
                + "Name : " + name);
    }
    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }


}
