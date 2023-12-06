package chapter4.oop.trainingground;

import chapter5.generics.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " strikes " + enemy.getName() + " with a sword");
        enemy.takeDamage(getDamage());
    }
}
