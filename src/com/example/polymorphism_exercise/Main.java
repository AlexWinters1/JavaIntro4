package com.example.polymorphism_exercise;

public class Main {
    private void go() {
        Warrior xena = new Warrior("Xena", 95);
        Warrior star = new Warrior("Star", 97);

        xena.setWeapon(new Wand());
        star.setWeapon(new Sword());

        xena.attack(star);
        star.attack(xena);

        xena.setWeapon(new Whip());
        xena.attack(star);

    }

    public static void main(String[] args) {
        new Main().go();
    }
}
