package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SortDriver {
    public static void main(String[] args){

        AudioPlayer A1 = new AudioPlayer("Iphone", "MP4");
        AudioPlayer A2 = new AudioPlayer("CD Player","WA3");

        Screen S1 = new Screen("720", 10, 10);
        MoviePlayer Mp1 = new MoviePlayer("APlayer", S1, MonitorType.LED);
        ArrayList<Product> players = new ArrayList<>();

        players.add(A1);
        players.add(A2);
        players.add(Mp1);
        Collections.sort(players);
        printList(players);

    }
    //Step 16
    public static void printList(ArrayList<Product> products){
        for(Product p : products){
            System.out.println(p);
        }
    }



}
