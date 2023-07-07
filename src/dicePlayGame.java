import java.util.Random;

public class dicePlayGame{

    public boolean diceGame(int target, int rollTimes) {
        int acc = 0;
        while (true) {
            if (rollTimes == 0){
                return acc == target;
            }
            Random diceRandom = new Random();
            int diceNum = diceRandom.nextInt((6 - 1) + 1) + 1;
            System.out.printf("The dice stopped at... %d...\n", diceNum);
            acc += diceNum;
            rollTimes -= 1;
            System.out.printf("Your current points: %d. And you have %d roll(s) left...\n", acc, rollTimes);
        }
    }
}
