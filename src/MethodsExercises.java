import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
//        add(5,7);
//        subtract(45,9);
//        multiply(5,8);
//        divide(200,5);
//        mod(60,13);
//        getInteger(1,10);
//        fact();
//        roll();
    }

    public static int add(int x, int y) {
        int result;
        result = x + y;
        System.out.println(x+"+"+y+"="+result);
        return result;
    }

    public static int subtract(int x, int y) {
        int result;
        result = x - y;
        System.out.println(x+"-"+y+"="+result);
        return result;
    }

    public static int multiply(int x, int y) {
        int result;
        result = x*y;
        System.out.println(x+"x"+y+"="+result);
        return result;
    }

    public static int divide(int x, int y) {
        int result;
        result = x/y;
        System.out.println(x+"/"+y+"="+result);
        return result;
    }

    public static int mod(int x, int y) {
        int result;
        result = x%y;
        System.out.println(x+"%"+y+"="+result);
        return result;
    }

    public static int getInteger(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        if (input>=x && input<=y) {
            System.out.println(input+" is between 1 and 10. Good job!");
            return input;
        } else {
            getInteger(x,y);
        }
        return input;
    }

    public static int fact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        if (input>=1 && input<=10) {
            int fact = 1;
            for (int i = 1; i <= input; i++) {
                fact = fact*i;
            }
            System.out.println(fact);
            return fact;
        } else {
            System.out.println("That's not between 1 and 10, wtf.");
            fact();
        }
        return input;
    }

    public static int roll() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to roll?\n  Y  |  N   ");
        String confirmRoll = sc.next();
        if (confirmRoll.equals("Y") || confirmRoll.equals("y")) {
            System.out.print("How many sides should each die have? Enter a number: ");
            int dieSides = sc.nextInt();
            System.out.println("You roll the dice...");
            int x = rand.nextInt(dieSides);
            int y = rand.nextInt(dieSides);
            System.out.println("You rolled: "+x+" and "+y);
        } else {
            System.out.println("Player opted not to roll");
        }
        return 0;
    }
}