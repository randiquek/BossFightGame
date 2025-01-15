package com.bossfight.model;

public class Boss extends Character {
    String bossName;

    public Boss(String bossName, int startingHealth, int currentHealth, int attack) {
        super(startingHealth, currentHealth, attack);
        this.bossName = bossName;
    }


//    public void displayBossInfo() {
//        startingHealth = 300;
//        bossName = "Terror Fiend";
//        System.out.println("Boss: " + bossName + "Health: " + startingHealth );
//    }
}
