package chapter4.oop.trainingground;

import chapter5.generics.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " cast " + enemy.getName() + " a spell");
        enemy.takeDamage(getDamage());
    }
}
