public class Animals {
    public String color(){
        return "Beige";
    }

    public String color(String otherColor){
        return "should be beige, but it is actually " + otherColor;
    }
}
