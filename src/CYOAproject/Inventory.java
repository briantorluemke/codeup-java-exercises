package CYOAproject;

public class Inventory {
    public String[] inventory;
    public int slots;
    public Inventory(int size) {
        inventory = new String[size];
        slots = inventory.length;
        for (int i = 0; i < slots; i++) {
            inventory[i] = "empty";
        }
    }

    public void getInv() {
        for (String slot:inventory) {
            System.out.println(slot);
        }
    }


    public static void main(String[] args) {
        Inventory inv = new Inventory(10);
        System.out.println("Your inventory contains:");
        inv.getInv();
    }
}