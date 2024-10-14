public class Hero {

    public static String [] heroesNames = {"Physical", "Magical", "Kinetic"};

    private int health;
    private int damage;
    private int superPower;

    public Hero(int health, int damage, int superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero() {

    }

    public static String[] getHeroesNames() {
        return heroesNames;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperPower() {
        return superPower;
    }
}