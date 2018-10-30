package com.company;

public class MoviePlayer extends Product implements MultimediaControl {

    Screen screen;
    MonitorType monitorType;

    MoviePlayer(String name , Screen screen, MonitorType monitorType){
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }
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

    public String toString() {
        return super.toString()
                + "\n" + "Screen : " + screen + "\n"
                + "Monitor Type : " + monitorType;
    }


}
