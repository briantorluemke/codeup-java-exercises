import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i =5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <=100; i++) {
//            if (i%15==0) {
//                System.out.println("FizzBuzz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            } else if (i%3==0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        int userNumber;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        userNumber = scNumber.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("Number" + "|" + "squared" + "|" + "cubed");
//
//        for (int i = 1; i<=userNumber; i++) {
//            System.out.println(i + "|" + i*i + "|" + i*i*i);
//        }
        int i;
        System.out.print("Enter a number: ");
        i = sc.nextInt();
        System.out.print("Are you sure you'd like to continue? Enter Y or N: ");
        String input;
        input = sc.next();
        if (input.equals("y")) {
            System.out.println("Continuing!");
            if (i <= 100 && i >= 88) {
                System.out.println(i + " would result in an A.");
            } else if (i <= 87 && i >= 80) {
                System.out.println(i + " would result in a B.");
            } else if (i <= 79 && i >= 67) {
                System.out.println(i + " would result in a C.");
            } else if (i <= 66 && i >= 60) {
                System.out.println(i + " would result in a D.");
            } else if (i <= 59 && i >= 0) {
                System.out.println(i + " would result in an F. Way to go.");
            }
        } else {
            System.out.println("Cancelled.");
        }
    }
}