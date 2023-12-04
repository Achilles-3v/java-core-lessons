package chapter4.oop.trainingground;

public class Hero {
    private String name;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " attack the enemy " + enemy.getName());
    }

    public int getDamage() {
        return damage;
    }
}
