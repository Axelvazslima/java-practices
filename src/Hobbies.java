import java.util.Scanner;

public class Hobbies {
    private final Scanner scanner;

    public Hobbies (){
        scanner = new Scanner(System.in);
    }
    public String hobby() {
        System.out.println("What do you like doing the most in your free time?");
        return scanner.nextLine();
    }

    public String sport(){
        System.out.println("What sport do you like playing the most?");
        return scanner.nextLine();
    }
}
