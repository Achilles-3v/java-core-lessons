package chapter4.oop.trainingground;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Kris", 15);
        Hero mage = new Mage("Sam", 20);
        Hero archer = new Archer("Legolaz", 10);

        Enemy enemy = new Enemy("Spock", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive())
                    hero.attackEnemy(enemy);
            }
        }
    }
}
