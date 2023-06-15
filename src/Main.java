public class Main {
    public static void main(String[] args) {
        int number = 456;
        Boss myBoss = new Boss("Force X",200 , 4.5);
        System.out.println(" HEALTH: " + myBoss.getHealth() + " DAMAGE: " +
                  myBoss.getTheDamage() + " PROTECTION: " + myBoss.getProtectionType());


    }
    public static Hero allHeroes(){
        Hero myHero = new Hero( "H-Titan", 250, 300);
        Hero ourHero = new Hero("Grand", 456, 333);
        Hero worldHero = new Hero("Logan", 567, 345);

        Hero[] createHeroes = new Hero[]{myHero, ourHero, worldHero};
        return allHeroes();
        
    }
}
