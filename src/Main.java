import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        selectFunction();

    }

    public static void selectFunction(){
        String[] functions = {"arraylistSample: 0", "arrayFromScanner: 1", "arraySample: 2", "whileArraySample: 3",
                "doWhileSample: 4", "hashMapSample: 5" };
        System.out.printf("These are all the functions you can call: %s\n", Arrays.toString(functions));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which one do you want to call? -Just type in it's index");
        int callingFunction = Integer.parseInt(scanner.nextLine());

        switch (callingFunction) {
            case 0 -> arrayListSample();
            case 1 -> arrayFromScanner();
            case 2 -> arraySample();
            case 3 -> whileArraySample();
            case 4 -> doWhileSample();
            case 5 -> hashMapSample();
            default -> {
                System.out.println("Please, input a valid number (0 - 5). Try again...");
                selectFunction();
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

    public static void arrayFromScanner(){
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
        int mainPoint = 1;

        do{
            System.out.println((mainPoint + 22) * 3);
            mainPoint++;
        }while(mainPoint <= 10);
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

}