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
        scanner.close();
    }

    public static void arrayListSample() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add((int) Math.pow(i, 8));
        }

        System.out.println(numbers);
    }

    public static void arrayFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want? ");
        int quantity = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++){
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }

        System.out.println(Arrays.toString(numbers));

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        System.out.printf("Your greatest number is: %d\nAnd your smallest numbers is: %d\n", sortedNumbers[sortedNumbers.length - 1], sortedNumbers[0]);
        scanner.close();
    }

    public static void arraySample() {
        int[] nums = {2, 4, 5, 3};
        System.out.println(Arrays.toString(nums));
        nums[2] = 22;
        nums[0] = 3;
        System.out.println(Arrays.toString(nums));
    }

    public static void whileArraySample(){
        String[] strings = new String[4];
        strings[0] = "Axel";
        strings[1] = "Vaz";
        strings[2] = "Souto";
        strings[3] = "Lima";

        int word = 0;
        String completeName = "";
        while (word < strings.length){
            completeName += strings[word];
            if (word == strings.length - 1){
                completeName += "\n";
                System.out.println(completeName);
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
        HashMap <String, Integer> grades = new HashMap<>();
        grades.put("Math", 10);
        grades.put("Computer Basics", 10);
        grades.put("Python", 10);
        grades.put("Java", 10);
        System.out.println(grades);

        grades.forEach((subject, grade) -> grades.replace(subject, grade + 10));
        System.out.println(grades);
    }

}