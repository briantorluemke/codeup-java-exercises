package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    static Input input = new Input();
    public static Movie[] films = MoviesArray.findAll();
    boolean choice;
    public static void movieList(){
        for (int i=0; i<films.length; i++){
            System.out.println(films[i].getName() + "-" + films[i].getCat());
        }
    }

    public static void movieGenre(String genre){
        for (int i =0; i<films.length; i++){
            if (genre.equalsIgnoreCase(films[i].getCat())){
                System.out.println(films[i].getName() + "-" + films[i].getCat());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weeb = "animated";
        String drama = "drama";
        String horror = "horror";
        String scifi = "scifi";
        boolean keepGoing = true;
        do {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice: ");
            int select = sc.nextInt();
            switch (select) {
                case 0:
                    keepGoing = false;
                    break;
                case 1:
                    movieList();
                    break;
                case 2:
                    movieGenre(weeb);
                    break;
                case 3:
                    movieGenre(drama);
                    break;
                case 4:
                    movieGenre(horror);
                    break;
                case 5:
                    movieGenre(scifi);
                    break;
            }
        } while (keepGoing);
    }
}