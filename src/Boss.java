public class Boss {
    private String health;

    private int damage;

    private double protectionType;

    public Boss(String Health, int Damage, double ProtectionType) {
        this.health = Health;
        this.damage = Damage;
        this.protectionType = ProtectionType;
    }

    public String getHealth() {
        return health;
    }

    public void setTheHealth(String theHealth) {
        this.health = theHealth;
    }

    public int getTheDamage() {
        return damage;
    }

    public void setTheDamage(int theDamage) {
        this.damage = theDamage;
    }

    public double getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(double protectionType) {
        this.protectionType = protectionType;
    }
}
