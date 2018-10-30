/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: com.company.Product.java
  Description: This program implements the com.company.Item.Java interface to a create a com.company.Product
  that will be manufactured. The item created will have the features of
  + The manufacturer of the product
  + Name
  + Serial Number
  + Date it was manufactured
*////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class AudioPlayer extends Product implements MultimediaControl {

    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer(String name , String audioSpecification ) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AUDIO;

    }
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
