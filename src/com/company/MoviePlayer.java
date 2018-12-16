/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: MoviePlayer.java
*////////////////////////////////////////////////////////////////////////////////////

package com.company;

//A subclass of Product that Implements MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl {
    //Sub class fields
    Screen screen;
    MonitorType monitorType;

    //Construct for MoviePlayer that sets its fields
    MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    //Methods from the interface MultimediaControl
    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void previous() {
        System.out.println("Previous");
    }

    public void next() {
        System.out.println("movie");
    }

    //Prints the MoviePlayer fields
    public String toString() {
        return super.toString() + "\n"
                + "Screen : " + screen + "\n"
                + "Monitor Type : " + monitorType;
    }


}
