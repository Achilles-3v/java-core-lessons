package chapter5.generics.weapon;

import chapter4.oop.trainingground.Archer;
import chapter4.oop.trainingground.Hero;
import chapter4.oop.trainingground.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Archer", 10);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Warrior", 15);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
