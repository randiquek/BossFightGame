package com.bossfight.model;

import com.bossfight.controller.MenuController;
import com.bossfight.view.ConsoleIO;

import java.util.Random;

public class Player extends Character {
    ConsoleIO io;

    public Player(String playerName, int startingHealth, int currentHealth, int attack) {
        super(playerName, startingHealth, currentHealth, attack);
    }

//    public int playerAttack(int attack) {
//        String playerChoice = io.getPlayerInput()
//    }
}
