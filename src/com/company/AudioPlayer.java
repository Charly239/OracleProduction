/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: AudioPlayer.java
*////////////////////////////////////////////////////////////////////////////////////
package com.company;

//A subclass of Product that implements the MultimediaControls interface
public class AudioPlayer extends Product implements MultimediaControl {
    //Subclass fields
    String audioSpecification;
    ItemType mediaType;

    //AudioPlayer constructor
    public AudioPlayer(String name , String audioSpecification ) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AUDIO;
    }
    //MultimediaControls interface methods
    public void play(){
        System.out.println("Playing");
    }
    public void stop(){
        System.out.println("Stopping");
    }
    public void previous(){
        System.out.println("Previous");
    }
    public void next(){
        System.out.println("Next");
    }

    public String toString() {
        return super.toString() + "\n" + "Audio Spec : " + audioSpecification +"\n"
                + "Type : " + mediaType;
    }

}
