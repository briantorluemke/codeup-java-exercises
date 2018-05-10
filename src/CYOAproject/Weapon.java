package CYOAproject;

public abstract class Weapon extends Item{
    protected String type; // ranged-magic-melee
    protected String name; // weapon/s name
    protected int damage; //weapon's damage, duh.

    public Weapon(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
}
