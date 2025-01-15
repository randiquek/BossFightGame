package com.bossfight.model;

import com.bossfight.controller.MenuController;

public class Player extends Character {
    MenuController playerName;

    public Player(MenuController playerName, int startingHealth, int currentHealth, int attack) {
        super(startingHealth, currentHealth, attack);
        this.playerName = playerName;
    }

//    public void displayPlayerInfo() {
//        startingHealth = 200;
//        System.out.println("Player: " + playerName + "Health: " + startingHealth );
//    }

//    public int playerAttack(int attack) {
//      return 0;
//    }
}
