/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: Product.java
  Description: This program implements the Item and Comparable Java interface to a create a Product
  that will be manufactured. The item created will have the features of
  + The manufacturer of the product
  + Name
  + Serial Number
  + Date it was manufactured
*/ ///////////////////////////////////////////////////////////////////////////////////
package com.company;

import java.util.Date;
//This class is the Parent class for all the products that wll be produced by Oracle
public abstract class Product implements Item, Comparable<Product> {

    //Product fields
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;
    private static int currentProductionNumber = 1;

    //Constructor to set name and fields of a product
    public Product(String N) {
        name = N;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();
        manufacturer = Item.manufacturer;
    }

    public void setProductionNumber(int P) {
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
    //Method to print Product fields
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
