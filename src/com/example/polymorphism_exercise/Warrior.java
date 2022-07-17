package com.example.polymorphism_exercise;
public class Warrior extends Person {
    Weapon weapon;

    public Warrior(String name, int health, Weapon weapon) {
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
        if (){

        }
    }
}
