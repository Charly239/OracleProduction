/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: AudioPlayerDriver.java
*////////////////////////////////////////////////////////////////////////////////////

package com.company;

//Creates an instance of AudioPlayer class
public class AudioPlayerDriver {
    public static void main(String[] args) {
        AudioPlayer A1 = new AudioPlayer("Iphone", "MP4");
        System.out.println(A1.toString());
        A1.play();
        A1.stop();
        A1.previous();
        A1.next();
    }
}
