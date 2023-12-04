package chapter4.oop.trainingground;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " shot an arrow");
    }
}
