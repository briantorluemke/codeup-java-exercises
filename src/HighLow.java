import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rand.nextInt(100);
        System.out.println("Want to play a game? \nY   |   N");
        String input = sc.next();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Pick a number between 1 and 100!");
            beginGame(n);
        }
    }

    public static int beginGame(int x) {
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        if (guess > x) {
            System.out.println("LOWER!");
            beginGame(x);
        } else if (guess < x) {
            System.out.println("HIGHER!");
            beginGame(x);
        } else if (guess == x) {
            System.out.println("That's the number!!! Good job guessing "+x);
            return guess;
        }
        return guess;
    }
}