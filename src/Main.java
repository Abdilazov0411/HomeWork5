
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefence("Physical");
        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: " + boss.getDamage() + " Boss defence: " + boss.getDefence());

        createHeroes();

    }
    public static void createHeroes(){
        Hero hero = new Hero();
        String[] array = Hero.getHeroesNames();
        for (String name: array) {
            System.out.println(name + "");
        }
    }
}