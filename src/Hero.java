public class Hero {

    private String health;

    private int damage;

    private double superPower;

    public String getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public double getSuperPower() {
        return superPower;
    }

    public Hero(String theHealth, int theDamage, int theSuperPower) {
        health = theHealth;
        damage = theDamage;
        superPower = theSuperPower;

    }

    public Hero(String theHealth, int theDamage) {
        health = theHealth;
        damage = theDamage;

    }
}
