package com.bossfight.model;

public class Character {
    int startingHealth;
    int currentHealth;
    int attack;

    public Character(int startingHealth, int currentHealth, int attack) {
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

}
