/*///////////////////////////////////////////////////////////////////////////////////
Author: Charly Garcia-Valero
  Date: 10/12/2018
  File: ItemType.java
  Description: Defines an Enum that will be used to define different item types.

*////////////////////////////////////////////////////////////////////////////////////
import java.lang.String;
public enum ItemType {
//All different Item types as well as a code or abbreviation for them
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISUAL_MOBILE("VM");

    private final String Type;
//This method sets the type of the item
    ItemType(String Type){
        this.Type = Type;
    }
    //This method returns the type of the item
    public String getType(){
        return Type;
    }

}
