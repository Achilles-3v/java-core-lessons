package chapter4.oop.trainingground;

import chapter5.generics.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shot " + enemy.getName() + " an arrow");
        enemy.takeDamage(getDamage());
    }
}
