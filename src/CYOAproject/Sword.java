package CYOAproject;

public class Sword extends Weapon implements ItemStats{
    public Sword(String name, String type, int damage) {
        super(name, type, damage);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}