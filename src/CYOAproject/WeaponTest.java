package CYOAproject;
import java.util.HashMap;

public class WeaponTest {
    public static void main(String[] args) {
        HashMap<String, Weapon> weapons = new HashMap<>();

        weapons.put("Sword1", new Weapon("Sword of the Fallen", "Sword", 8));
        Weapon sword1 = weapons.get("Sword1");

        System.out.println("Your weapon is: " + sword1.getName()+"\n" +
                "It is a "+sword1.getType() +" with "+sword1.getDamage()+ " damage.");
    }
}