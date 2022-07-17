package com.example.polymorphism_exercise;
public class Warrior extends Person {
    Weapon weapon;

    public Warrior(String name, int health) {
        super(name, health);
        this.weapon = weapon;

    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void decHealth(int amt) {
         health = Math.max(0, health - amt);
    }

    public void attack(Warrior opponent){
        if (health > 0 && weapon != null){
            System.out.println(name + " is attacking " + opponent.name);
            System.out.println(opponent.name + " " + opponent.health);
        }
    }
}
