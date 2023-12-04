package chapter4.oop.trainingground;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " strikes " + enemy.getName() + " with a sword");
        enemy.takeDamage(getDamage());
    }
}
