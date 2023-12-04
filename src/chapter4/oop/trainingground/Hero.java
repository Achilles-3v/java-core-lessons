package chapter4.oop.trainingground;

public class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println(name + " attack the enemy");
    }
}