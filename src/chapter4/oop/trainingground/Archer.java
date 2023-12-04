package chapter4.oop.trainingground;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shot " + enemy.getName() + " an arrow");
        enemy.takeDamage(getDamage());
    }
}
