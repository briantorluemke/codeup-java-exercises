import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        int userNumber;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        userNumber = sc.nextInt();
//        System.out.println("You entered: "+userNumber);

//        String userOne;
//        String userTwo;
//        String userThree;
//        System.out.print("Enter three words: ");
//        userOne = sc.next();
//        userTwo = sc.next();
//        userThree = sc.next();
//        System.out.println(userOne+" "+userTwo+" "+userThree);

//        String userSentence;
//        System.out.print("Enter a sentence: ");
//        userSentence = sc.nextLine();
//        System.out.print(userSentence);

        double length;
        double width;
        double height;
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        double area = length * width;
        double perimeter = (2*length) + (2*width);
        double volume = length * width * height;
        System.out.println("Area is: "+area+", perimeter is: "+perimeter+", and volume is "+volume);
    }
}