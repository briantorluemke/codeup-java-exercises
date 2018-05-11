package CYOAproject;

public class Weapon extends Item implements ItemStats{
    protected String type; // ranged-magic-melee
    protected String name; // weapon/s name
    protected int damage; //weapon's damage, duh.

    public Weapon(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}