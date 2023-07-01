import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class User {

    private final Scanner scanner;

    public User(){
        scanner = new Scanner(System.in);
    }

    public String getName(){
        System.out.println("What's your name?");
        return scanner.nextLine();
    }

    public LocalDate getBirthDay(){
        System.out.println("When is your birthday? Input Example > 'YYYY-MM-DD'");
        return LocalDate.parse(scanner.nextLine());
    }

    public int age(LocalDate birthDay){
        return Period.between(birthDay, LocalDate.now()).getYears();
    }
}
