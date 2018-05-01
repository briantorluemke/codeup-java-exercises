import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userResponse;
        System.out.print("Say something: ");
        Scanner sc = new Scanner(System.in);
        userResponse = sc.next();
        if (userResponse.contains("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.contains("?")) {
            System.out.println("Sure.");
        } else if (userResponse.contains(".")) {
            System.out.println("Why should I care?");
        } else if (userResponse.contains("!")) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
