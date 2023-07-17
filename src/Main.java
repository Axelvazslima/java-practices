import java.util.*;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        selectMethod();
    }

    public static void selectMethod() {
        String[] methods = {"arraylistSample: 0", "arrayFromScannerSample: 1", "arraySample: 2", "whileArraySample: 3", "doWhileSample: 4", "hashMapSample: 5", "userInfoSample: 6", "randomNumberGuessingGame: 7", "pyramidSample: 8", "palindromeNumberSample: 9", "polymorphismSample: 10", "diceLuckGame: 11", "productsManagement: 12", "factorial: 13", "employeeInfo: 14", "currencyConverter: 15", "bankLogin: 16", "counterPositivesNegativesZeros: 17", "matrix: 18", "reverseArray: 19", "bubbleSort: 20"};
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
            case 11 -> diceLuckGame();
            case 12 -> productsManagement();
            case 13 -> factorial();
            case 14 -> employeeInfo();
            case 15 -> currencyConverter();
            case 16 -> bankLogin();
            case 17 -> counterPositivesNegativesZeros();
            case 18 -> matrix();
            case 19 -> reverseArray();
            case 20 -> bubbleSort();
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

    public static void arrayFromScannerSample() {
        System.out.println("This piece of code gives you an array of the size you want and with the elements you want. Then, it tells you your greatest and smallest number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want? ");
        int quantity = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        System.out.printf("Your Array: %s\nYour greatest number is: %d\nYour smallest numbers is: %d\n", Arrays.toString(numbers), sortedNumbers[sortedNumbers.length - 1], sortedNumbers[0]);
        scanner.close();
    }

    public static void arraySample() {
        System.out.println("Example of Array changing it's values based on index assignment.");
        int[] nums = {2, 4, 5, 3};
        System.out.printf("Before: %s\n", Arrays.toString(nums));
        nums[2] = 22;
        nums[0] = 3;
        System.out.printf("After: %s\n", Arrays.toString(nums));
    }

    public static void whileArraySample() {
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
        while (word < strings.length) {
            completeName += strings[word];
            if (word == strings.length - 1) {
                completeName += "\n";
                System.out.printf("The output: %s\n", completeName);
            } else {
                completeName += ' ';
            }
            word++;
        }
    }

    public static void doWhileSample() {
        System.out.println("This is an example of a 'do... while loop', it runs the first time and then checks the condition > so it's always executed at least once.");
        int mainPoint = 1;

        do {
            System.out.println((mainPoint + 22) * 3);
            mainPoint++;
        } while (mainPoint <= 10);
    }

    public static void hashMapSample() {
        System.out.println("This code stores your grades. Just input the subject and then your grades (numbers separated by whitespaces). To stop it, input '-' instead of the subject name.");
        System.out.println("Input Examples: 'Programming'\n10 9.8 10");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, double[]> grades = new HashMap<>();
        while (true) {
            String key = scanner.nextLine();
            if (key.equals("-")) {
                break;
            }

            String[] valueArray = scanner.nextLine().split("\\s+");
            double[] value = new double[valueArray.length];
            for (int i = 0; i < valueArray.length; i++) {
                value[i] = Double.parseDouble(valueArray[i]);
            }
            grades.put(key, value);
        }
        grades.forEach((keyPair, valuePair) -> System.out.println(keyPair + ": " + Arrays.toString(valuePair)));
    }

    public static void userInfoSample() {
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
        if (userName.toLowerCase().endsWith("s")) {
            System.out.printf("\n%s' information:\n", userName);
        } else {
            System.out.printf("\n%s's information:\n", userName);
        }

        info.forEach((key, value) -> System.out.println(key + ": " + value));
        scanner.close();
    }

    public static void randomNumberGuessingGameSample() {
        System.out.println("This game is random number generator. You have to guess what's the correct number. You have three guesses if your difficult is above 5, otherwise you just have 1 try.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How difficult do you want this game to be? Just type in a number.");

        int limitNum = Integer.parseInt(scanner.nextLine());
        Random number = new Random();
        int triesLeft;
        String singularPlural;

        if (limitNum > 5) {
            triesLeft = 3;
            singularPlural = "chances";
        } else {
            triesLeft = 1;
            singularPlural = "chance";
        }

        System.out.printf("The game is getting started. You have %d %s to get it right. Good Luck!\n", triesLeft, singularPlural);
        while (true) {
            int userGuess = Integer.parseInt(scanner.nextLine());
            int target = number.ints(1, 0, limitNum).findFirst().getAsInt();
            if (userGuess == target) {
                System.out.println("Congrats, you got it right!");
                break;
            }
            triesLeft -= 1;
            if (triesLeft < 1) {
                System.out.printf("You lost. The correct answer was: %s.\n", target);
                break;
            }
            if (triesLeft == 1) {
                System.out.println("Wrong, try again... It's your last chance!");
            } else {
                System.out.printf("Wrong, try again... You still got %d tries left.\n", triesLeft);
            }
        }
        scanner.close();
    }

    public static void pyramidSample() {
        System.out.println("This code prints a pyramid the size the user wants.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall do you want your pyramid to be?");
        int sizeOfPyramid = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= sizeOfPyramid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }

    public static void palindromeNumberSample() {
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
        } else {
            System.out.println("A single number is always a palindrome. Try it with a number equal or bigger than 10.");
        }
        scanner.close();
    }

    public static void polymorphismSample() {
        System.out.println("This is a code example just for me to see the Polymorphism in practice.");
        Zebra zebra = new Zebra();
        Animals dog = new Animals();
        Animals cat = new Animals();
        System.out.printf("The dog is %s, the zebra is %s and the cat is %s.\n", dog.color(), zebra.color(), cat.color("white"));
    }

    public static void diceLuckGame() {
        System.out.println("This a luck game. You win if the numbers in the dice matches the target at the end of the game.");
        Scanner scanner = new Scanner(System.in);
        DicePlayGame dice = new DicePlayGame();
        System.out.print("Input your target: ");
        int target = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the amount of times the dice you roll: ");
        int rolls = Integer.parseInt(scanner.nextLine());
        if (dice.diceGame(target, rolls)) {
            System.out.println("Congrats! You won!");
        } else {
            System.out.println("You lost...");
        }
        scanner.close();
    }

    public static void productsManagement() {
        ArrayList<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the items for sell:");
        String[] baseProducts = scanner.nextLine().split("\\s+");
        for (String product : baseProducts) {
            products.add(product);
        }
        while (true) {
            if (products.isEmpty()) break;
            System.out.print("What do you want to buy? ");
            String sold = scanner.nextLine();
            try {
                products.remove(sold);
            } catch (Exception e) {
                System.out.println("This item does not exist.");
            }
        }
        System.out.println("Items are all sold out.");
        scanner.close();
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want it's factorial: ");
        int number = Integer.parseInt(scanner.nextLine());

        int counter = number;
        while (counter > 0) {
            counter--;
            number += counter;
        }
        System.out.println(number);
    }

    public static void employeeInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What is your role in the Company? ");
        String role = scanner.nextLine();
        System.out.print("What is your employee id? ");
        int id = Integer.parseInt(scanner.nextLine());

        Employees employee = new Employees(name, id, role);
        employee.setSalary();
        employee.setTax();
        System.out.println(employee);
        scanner.close();
    }

    public static void currencyConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much does the other country currency cost: ");
        double currency = Double.parseDouble(scanner.nextLine());
        System.out.print("How much money do you want to exchange: ");
        double myMoney = Double.parseDouble(scanner.nextLine());
        double total = CurrencyConverter.converter(myMoney, currency);
        System.out.printf("You have $%.2f and want to trade for a currency that costs $%.2f. You will get $%.2f back", myMoney, currency, total);
        scanner.close();
    }

    public static void bankLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please register yourself to proceed");

        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Insert your password: ");
        String password = sc.nextLine();
        BankSystem user = new BankSystem(name, password);

        user.setAccountId((int) (Math.random() * 999) + 100);
        System.out.printf("Your bank id is going to be: %d\n", user.getAccountId());
        user.setAccountId(user.getAccountId());

        System.out.printf("Welcome, %s (%d)!\nHow much do you want to transfer at first?\n", user.getName(), user.getAccountId());
        user.setInitialAmount(Float.parseFloat(sc.nextLine()));
        System.out.printf("Thank you, %s! Now you have $%.2f in our bank.", user.getName(), user.getInitialAmount());
    }

    public static void counterPositivesNegativesZeros() {
        System.out.println("This method is a loop that receives int inputs and tells how many of them were positive, negative and zeros");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many numbers do you want to insert:");
        int limit = Math.abs(Integer.parseInt(sc.nextLine()));

        int positives = 0;
        int zeros = 0;
        int negatives = 0;
        for (int i = 0; i < limit; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num > 0) positives++;
            if (num < 0) negatives++;
            if (num == 0) zeros++;
        }

        System.out.printf("There were %d positives numbers, %d zeros and %d negative numbers.", positives, zeros, negatives);

        sc.close();
    }

    public static void matrix() {
        System.out.println("This method is a matrix practice. It receives an user input defining the dimensions of the square matrix. It prints out the Matrix (filled with random numbers from 0 to 100), it's size, the sum of it's elements and it's main diagonal - and the sum of it's elements.");
        Scanner sc = new Scanner(System.in);

        System.out.print("What size do you want this square Matrix to be: ");
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[size][size];
        int[] diag = new int[size];

        int matrixSum = 0;
        int diagSum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                if (i == j) {
                    diag[i] = matrix[i][j];
                    diagSum += matrix[i][j];
                }
                matrixSum += matrix[i][j];
            }
        }
        System.out.printf("\nThe main matrix (%d x %d) is: %s (sum: %d).\nIt's main diagonal is: %s (sum: %d).", size, size, Arrays.deepToString(matrix), matrixSum, Arrays.toString(diag), diagSum);

        sc.close();
    }

    public static void reverseArray() {
        System.out.print("Choose the size of your array: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        System.out.println("This code generates random numbers from 1 to 99 and adds them to an array. Finally, it reverses the array.");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        System.out.printf("Original array: %s\n", Arrays.toString(array));
        for (int j = 0; j < size / 2; j++) {
            int lastIndexPiece = size - 1 - j;
            int start = array[j];
            int finale = array[lastIndexPiece];
            array[j] = finale;
            array[lastIndexPiece] = start;
        }
        System.out.printf("Reversed Array: %s", Arrays.toString(array));
        scanner.close();
    }

    public static void bubbleSort() {
        System.out.println("This method sorts an array using the bubble sort algorithm.\nTo start, input the size of the array.");
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        System.out.printf("The original array: %s\n", Arrays.toString(array));

        for (int j = 0; j < size; j++) {
            for (int k = (j + 1); k < size; k++) {
                int cur_j = array[j];
                int cur_k = array[k];
                if (cur_k < cur_j) {
                    array[j] = cur_k;
                    array[k] = cur_j;
                }
            }
        }
        System.out.printf("The sorted array: %s", Arrays.toString(array));
        sc.close();
    }
}