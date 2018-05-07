import java.util.Random;
import util.Input;

public class ServerNameGenerator {
    static String adjectives[] = {"sneaky", "giant", "spotty", "boundless", "thoughtful", "barbarous", "languid", "chunky", "dizzy", "unsightly"};
    static String nouns[] = {"reality", "method", "w", "drama", "river", "employment", "efficiency", "apple", "tooth", "attitude"};
    static Random rand = new Random();

    static Input input = new Input();

    public static String getAdjective() {
        int x = rand.nextInt(10);
        return adjectives[x];
    }

    public static String getNoun() {
        int y = rand.nextInt(10);
        return nouns[y];
    }

    public static void main(String[] args) {
        boolean val;
        do {
            System.out.println("Your server name is: " + getAdjective() + "-" + getNoun());
            System.out.println("Would you like to rename your server?");
            val = input.yesNo();
        } while (val);
    }
}