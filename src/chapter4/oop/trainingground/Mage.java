package chapter4.oop.trainingground;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " cast " + enemy.getName() + " a spell");
    }
}
