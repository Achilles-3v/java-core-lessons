package chapter4.oop.trainingground;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " strikes with a sword");
    }
}
