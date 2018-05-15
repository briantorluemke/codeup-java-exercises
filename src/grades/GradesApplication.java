package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        getInfo();
    }
    private static void getInfo() {
        HashMap<String, Student> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean cont;

        students.put("dug", new Student("Brian"));
        students.put("shake", new Student("Jake"));
        students.put("tryingyeti", new Student("Nestor"));

        students.get("dug").addGrade(98);
        students.get("dug").addGrade(94);
        students.get("dug").addGrade(92);

        students.get("shake").addGrade(99);
        students.get("shake").addGrade(92);
        students.get("shake").addGrade(89);

        students.get("tryingyeti").addGrade(64);
        students.get("tryingyeti").addGrade(87);
        students.get("tryingyeti").addGrade(37);
        do {
            Student dug = students.get("dug");
            Student shake = students.get("shake");
            Student tryingyeti = students.get("tryingyeti");
            System.out.print("Welcome!" +
                    "\n" +
                    "\n" +
                    "Here are the usernames of our students:" +
                    "\n" +
                    "| dug |  -  | shake |  -  | tryingyeti |" +
                    "\n" +
                    "Who would you like to see more about?" +
                    "\n" +
                    ">");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("dug")) {
                System.out.println("You selected " + dug.getName() + ", who has a grade average of " + dug.getGradeAverage());
            } else if (choice.equalsIgnoreCase("shake")) {
                System.out.println("You selected " + shake.getName() + ", who has a grade average of " + shake.getGradeAverage());
            } else if (choice.equalsIgnoreCase("tryingyeti")) {
                System.out.println("You selected " + tryingyeti.getName() + ", who has a grade average of " + tryingyeti.getGradeAverage());
            } else {
                System.out.print("That's not one of our students... try again.\n" +
                        ">");
            }
            System.out.print("Would you like to look at another student's information? Y | N : ");
            String choice2 = sc.next();
            cont = choice2.equalsIgnoreCase("y");
        } while (cont);
    }
}


