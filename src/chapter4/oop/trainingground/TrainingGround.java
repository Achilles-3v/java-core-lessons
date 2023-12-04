package chapter4.oop.trainingground;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Kris");
        Hero mage = new Mage("Sam");
        Hero archer = new Archer("Legolaz");

        Enemy enemy = new Enemy("Spock", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
