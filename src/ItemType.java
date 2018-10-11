
import java.lang.String;
public enum ItemType {
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISUAL_MOBILE("VM");

    private final String Type;

    ItemType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return Type;
    }

}
