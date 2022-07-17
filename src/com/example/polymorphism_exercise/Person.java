package com.example.polymorphism_exercise;

public class Person {
    public String name;
    public int health = 100;

   public Person(String name, int health) {
       this.name = name;
       this.health = health;
   }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
