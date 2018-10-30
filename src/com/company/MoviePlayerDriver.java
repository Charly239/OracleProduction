package com.company;

public class MoviePlayerDriver {
    public static void main(String[] args){
        Screen S1 = new Screen("720",10,10);
        MoviePlayer Mp1 = new MoviePlayer("Player",S1,MonitorType.LED);
        System.out.println(Mp1.toString());
        Mp1.play();
        Mp1.stop();
        Mp1.previous();
        Mp1.next();
    }


}
