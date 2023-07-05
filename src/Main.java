import java.util.*;
import java.time.LocalDate;

class Main{
    public static void main(String[] args){
        selectMethod();
    }

    public static void selectMethod(){
        String[] methods = {"arraylistSample: 0", "arrayFromScannerSample: 1", "arraySample: 2", "whileArraySample: 3", "doWhileSample: 4", "hashMapSample: 5", "userInfoSample: 6", "randomNumberGuessingGame: 7", "pyramidSample: 8", "palindromeNumberSample: 9", "polymorphismSample: 10" };
        System.out.printf("These are all the methods you can call: %s\n", Arrays.toString(methods));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which one do you want to call? -Just type in it's index");
        int callingMethod = Integer.parseInt(scanner.nextLine());

        switch (callingMethod) {
            case 0 -> arrayListSample();
            case 1 -> arrayFromScannerSample();
            case 2 -> arraySample();
            case 3 -> whileArraySample();
            case 4 -> doWhileSample();
            case 5 -> hashMapSample();
            case 6 -> userInfoSample();
            case 7 -> randomNumberGuessingGameSample();
            case 8 -> pyramidSample();
            case 9 -> palindromeNumberSample();
            case 10 -> polymorphismSample();
            default -> {
                System.out.printf("Please, input a valid number (0 - %d). Try again...\n", methods.length - 1);
                selectMethod();
            }
        }
    }

    public static void arrayListSample() {
        System.out.println("This code uses an Array List. It adds integers raised to the power of >User Input< to the list using a for loop from 0 to >User Input<.");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("It starts in 0 (zero) and goes up to (Inclusive): ");
        int limit = Integer.parseInt(scanner.nextLine());
        System.out.print("These numbers will be raised to the power of: ");
        int power = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= limit; i++) {
            numbers.add((int) Math.pow(i, power));
        }

        System.out.printf("The list: %s", numbers);
        scanner.close();
    }

    public static void arrayFromScannerSample(){
        System.out.println("This piece of code gives you an array of the size you want and with the elements you want. Then, it tells you your greatest and smallest number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want? ");
        int quantity = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++){
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        System.out.printf("Your Array: %s\nYour greatest number is: %d\nYour smallest numbers is: %d\n", Arrays.toString(numbers),sortedNumbers[sortedNumbers.length - 1], sortedNumbers[0]);
        scanner.close();
    }

    public static void arraySample() {
        System.out.println("Example of Array changing it's values based on index assignment.");
        int[] nums = {2, 4, 5, 3};
        System.out.printf("Before: %s\n",Arrays.toString(nums));
        nums[2] = 22;
        nums[0] = 3;
        System.out.printf("After: %s\n", Arrays.toString(nums));
    }

    public static void whileArraySample(){
        String[] strings = new String[4];
        strings[0] = "Axel";
        strings[1] = "Vaz";
        strings[2] = "Souto";
        strings[3] = "Lima";
        System.out.printf("""
                        Example of code that turns an array of strings in a single word using a while loop. In this case each array element is a part of my name. It outputs my complete name
                        The array: %s
                        """,
                Arrays.toString(strings));

        int word = 0;
        String completeName = "";
        while (word < strings.length){
            completeName += strings[word];
            if (word == strings.length - 1){
                completeName += "\n";
                System.out.printf("The output: %s\n", completeName);
            }else{
                completeName += ' ';
            }
            word++;
        }
    }

    public static void doWhileSample(){
        System.out.println("This is an example of a 'do... while loop', it runs the first time and then checks the condition > so it's always executed at least once.");
        int mainPoint = 1;

        do{
            System.out.println((mainPoint + 22) * 3);
            mainPoint++;
        } while(mainPoint <= 10);
    }

    public static void hashMapSample(){
        System.out.println("This code stores your grades. Just input the subject and then your grades (numbers separated by whitespaces). To stop it, input '-' instead of the subject name.");
        System.out.println("Input Examples: 'Programming'\n10 9.8 10");
        Scanner scanner = new Scanner(System.in);
        HashMap <String, double[]> grades = new HashMap<>();
        while (true){
            String key = scanner.nextLine();
            if (key.equals("-")){
                break;
            }

            String[] valueArray = scanner.nextLine().split("\\s+");
            double[] value = new double[valueArray.length];
            for (int i = 0; i < valueArray.length; i ++){
                value[i] = Double.parseDouble(valueArray[i]);
            }
            grades.put(key, value);
        }
        grades.forEach((keyPair, valuePair)-> System.out.println(keyPair + ": " + Arrays.toString(valuePair)));
    }

    public static void userInfoSample(){
//        The code provided intentionally demonstrates different styles as an educational exercise. Specifically, the 'User' class uses methods to set the user: name, birthday and age, while the Hobbies class utilizes constructors with parameters to set the user: hobbies and favorite sports.
        Scanner scanner = new Scanner(System.in);
        System.out.println("This function simulates a user input login");
        User user = new User();
        String userName = user.getName();
        LocalDate userBirthDay = user.getBirthDay();
        int userAge = user.getAge(userBirthDay);
        System.out.printf("Welcome, %s!\n", userName);

        System.out.println("Input the thing you like doing the most in your free time the the sports you like playing the most -these must be separated by commas and a space.");
        Hobbies hobbies = new Hobbies(scanner.nextLine(), scanner.nextLine());

        HashMap<String, Object> info = new HashMap<>();
        info.put("Name", userName);
        info.put("Birthday", userBirthDay);
        info.put("Age", userAge);
        info.put("Hobby", hobbies.getHobby());
        info.put("Sports", hobbies.getSports());

        userName = userName.trim();
        if (userName.toLowerCase().endsWith("s")){
            System.out.printf("\n%s' information:\n", userName);
        } else {
            System.out.printf("\n%s's information:\n", userName);
        }

        info.forEach((key, value)-> System.out.println(key + ": " + value));
        scanner.close();
    }

    public static void randomNumberGuessingGameSample(){
        System.out.println("This game is random number generator. You have to guess what's the correct number. You have three guesses if your difficult is above 5, otherwise you just have 1 try.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How difficult do you want this game to be? Just type in a number.");

        int limitNum = Integer.parseInt(scanner.nextLine());
        Random number = new Random();
        int triesLeft;
        String singularPlural;

        if (limitNum > 5){
            triesLeft = 3;
            singularPlural = "chances";
        }
        else{
            triesLeft = 1;
            singularPlural = "chance";
        }

        System.out.printf("The game is getting started. You have %d %s to get it right. Good Luck!\n", triesLeft, singularPlural);
        while (true){
            int userGuess = Integer.parseInt(scanner.nextLine());
            int target = number.ints(1, 0, limitNum).findFirst().getAsInt();
            if (userGuess == target){
                System.out.println("Congrats, you got it right!");
                break;
            }
            triesLeft -= 1;
            if (triesLeft < 1){
                System.out.printf("You lost. The correct answer was: %s.\n", target);
                break;
            }
            if (triesLeft == 1){
                System.out.println("Wrong, try again... It's your last chance!");
            } else {
                System.out.printf("Wrong, try again... You still got %d tries left.\n", triesLeft);
            }
        }
        scanner.close();
    }

    public static void pyramidSample(){
        System.out.println("This code prints a pyramid the size the user wants.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall do you want your pyramid to be?");
        int sizeOfPyramid = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= sizeOfPyramid; i ++){
            for (int j = 1; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }

    public static void palindromeNumberSample(){
        System.out.println("A number is a palindrome when it's the same when read backwards, like: 121. This code checks if the user input number is a palindrome or not.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int numberInput = Integer.parseInt(scanner.nextLine());
        String numberInputTester = Integer.toString(numberInput);
        StringBuilder numberInputComparison = new StringBuilder();
        if (numberInputTester.length() > 1) {
            for (int i = numberInputTester.length() - 1; i >= 0; i--) {
                numberInputComparison.append(numberInputTester.charAt(i));
            }
            System.out.printf("%s backwards is: %s. So, this number is ", numberInputTester, numberInputComparison);
            if (numberInputComparison.toString().equals(numberInputTester)) {
                System.out.println("a Palindrome!");
            } else {
                System.out.println("not a Palindrome...");
            }
        }else{
            System.out.println("A single number is always a palindrome. Try it with a number equal or bigger than 10.");
        }
        scanner.close();
    }

    public static void polymorphismSample(){
        System.out.println("This is a code example just for me to see the Polymorphism in practice.");
        Zebra zebra = new Zebra();
        Animals dog = new Animals();
        Animals cat = new Animals();
        System.out.printf("The dog is %s, the zebra is %s and the cat is %s.\n", dog.color(), zebra.color(), cat.color("white"));
    }
}