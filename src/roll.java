import java.util.Random;
import java.util.Scanner;

public class roll {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rand.nextInt(11);
        String confirmRoll;
        System.out.print("Would you like to roll?\nY | N: ");
        confirmRoll = sc.next();
        if (confirmRoll.equals("Y") || confirmRoll.equals("y")) {
            System.out.println("You rolled a " + n);
        } else {
            System.out.println("Player opted not to roll");
        }
    }
}