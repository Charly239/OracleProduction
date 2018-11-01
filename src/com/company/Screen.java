package com.company;

//This class creates a screen for the MoviePlayers with different Spec by implementing the ScreenSpec interface
public class Screen implements ScreenSpec {

    String resolution;
    int refreshrate;
    int responsetime;

    public Screen(String resolution, int refreshrate, int responsetime){
        this.resolution = resolution;
        this.refreshrate = refreshrate;
        this.responsetime = responsetime;

    }

    public String getResolution(){
        return resolution;
    }
    public int getRefreshRate(){
        return refreshrate;
    }
    public int getResponseTime(){
        return responsetime;
    }

    public String toString(){
        return ("Resolution : " + resolution +"\n"
                + "Refresh Rate : " + refreshrate + "\n"
                + "Response time : " + responsetime );
    }
}
