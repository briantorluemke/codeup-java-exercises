package CYOAproject;

public class WeaponTest {
    public static void main(String[] args) {
        ItemStats sw = new Sword("Sword of the Fallen", "Sword", 8);
        System.out.println("Your weapon is: " + sw.getName()+"\n" +
                "It is a "+sw.getType() +" with "+sw.getDamage()+ " damage.");
    }
}