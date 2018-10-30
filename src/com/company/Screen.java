package com.company;

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
    public int etResponseTime(){
        return responsetime;
    }

    public String toString(){
        return ("Resolution : " + resolution +"\n"
                + "Refresh Rate : " + refreshrate + "\n"
                + "Response time : " + responsetime );
    }
}
