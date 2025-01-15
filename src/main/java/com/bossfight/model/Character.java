package com.bossfight.model;

import java.util.Random;

public class Character {
    int startingHealth;
    int currentHealth;
    int attack;
    String name;

    public Character(String name, int startingHealth, int currentHealth, int attack) {
        this.name = name;
        this.startingHealth = startingHealth;
        this.currentHealth = currentHealth;
        this.attack = attack;
    }

    public int getStartingHealth() {
        return startingHealth;
    }

    public void setStartingHealth(int startingHealth) {
        this.startingHealth = startingHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void displayInfo() {
        System.out.println(name + " Health: " + currentHealth + "/" + startingHealth);
    }

}
