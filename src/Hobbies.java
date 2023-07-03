import java.util.Arrays;

public class Hobbies {
    private final String hobby;
    private final String[] sports;
    Hobbies (String hobby, String sport){
        this.hobby = hobby;
        this.sports = sport.split(", ");
    }

    public String getHobby(){
        return hobby;
    }

    public String getSports(){
        return Arrays.toString(sports);
    }
}
