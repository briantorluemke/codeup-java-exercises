package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    boolean val;

    public String getString() {
        System.out.println("Type a String: ");
        String input = scanner.next();
        System.out.println(input);
        return null;
    }

    public boolean yesNo() {
        System.out.println("Yes or No: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            val = true;
        } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
            val = false;
        } else {
            System.out.println("Oops, I'm not sure what you mean by that.. try again!");
            yesNo();
        }
        return val;
    }

    public int getInt(int min, int max) {
        int input2;
        try {
            System.out.println("Type a number between " + min + " and " + max + ": ");
            String input = scanner.next();
            input2 = Integer.valueOf(input);
            System.out.println("Testing the value of "+input2+"...");
            if (input2 > max) {
                System.out.println("Try again... remember the numbers to choose from are " + min + " and " + max);
                getInt(min, max);
            } else if (input2 < min) {
                System.out.println("Try again... remember the numbers to choose from are " + min + " and " + max);
                getInt(min, max);
            } else {
                System.out.println(input2+" is a working integer!");
                return input2;
            }
            System.out.println(input2);
            return input2;
        } catch (NumberFormatException e) {
            System.out.println("You must not have entered a number. Try again.");
            return getInt(min, max);
        }
    }

    public int getInt() {
        int input2;
        try {
            System.out.println("Type an integer: ");
            String input = scanner.next();
            input2 = Integer.valueOf(input);
            System.out.println(input2);
            return input2;
        } catch (NumberFormatException e) {
            System.out.println("You must not have entered a number. Try again.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double input2;
        try {
            System.out.println("Type a decimal number between " + min + " and " + max + ": ");
            String input = scanner.next();
            input2 = Double.valueOf(input);
            if (input2 > max) {
                System.out.println("Try again... remember the numbers to choose from are " + min + " and " + max);
                getDouble(min, max);
            } else if (input2 < min) {
                System.out.println("Try again... remember the numbers to choose from are " + min + " and " + max);
                getDouble(min, max);
            } else {
                System.out.println(input2);
                return input2;
            }
            return input2;
        } catch (NumberFormatException e) {
            System.out.println("You must not have entered a double. Try again.");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        double input2;
        try {
            System.out.println("Type a decimal: ");
            String input = scanner.next();
            System.out.println(input);
            input2 = Double.valueOf(input);
            return input2;
        } catch (NumberFormatException e) {
            System.out.println("You must not have entered a double. Try again.");
            return getDouble();
        }
    }
}