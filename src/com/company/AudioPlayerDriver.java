package com.company;

public class AudioPlayerDriver {
    public static void main(String[] args){
        AudioPlayer A1 = new AudioPlayer("Iphone","MP4");
        System.out.println(A1.toString());
        A1.play();
        A1.stop();
        A1.previous();
        A1.next();
    }
}
