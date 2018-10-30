package com.company;

public class ScreenDriver {

    public static void main(String[] args){
        Screen ExScreen1 = new Screen("720p", 1,11);
        System.out.println(ExScreen1);
        ExScreen1.resolution = "1080p";
        ExScreen1.refreshrate = 10;
        ExScreen1.responsetime = 10;
        System.out.println(ExScreen1.toString());
    }
}
