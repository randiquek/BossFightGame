package com.bossfight.controller;

import com.bossfight.model.Boss;
import com.bossfight.model.DamageCalc;
import com.bossfight.model.Player;
import com.bossfight.view.ConsoleIO;

public class MenuController {
    ConsoleIO io;
    Player player;
    Boss boss;
    boolean isRunning = false;
    String playerName;

    public MenuController(ConsoleIO io) {
        this.io = io;
    }

    public void runGame() {
        boolean isRunning = true;

        while(isRunning) {
            io.displayMessage("Welcome to The Boss Fight");
            playerName = io.getPlayerInput("Enter your player name: ");
            io.displayMessage("Hello, " + playerName);
            player = new Player(playerName, 200, 200, 25);
            printGameMenu();

            int playerChoice = io.getInteger();

            switch(playerChoice) {

                case 1:
                    startGame();
                    break;
                case 2:
                    io.displayMessage("Thanks for playing! See you next time, " + playerName);
                    isRunning = false;
                    break;
            }

            battle();

        }
    }

    public void printGameMenu() {
        io.displayMessage("----Game Menu----");
        io.displayMessage("1. Start New Game");
        io.displayMessage("2. Quit");
    }

    public void battleMenu() {
        io.displayMessage("----Battle Menu----");
        io.displayMessage("1. Attack");

    }

    public void startGame() {
        io.displayMessage("Game starting...");
        boss = new Boss("Terror Fiend", 200, 200, 20);
    }

    public void battle() {
//        io.displayMessage(playerName + " attacks first");
        while(true) {

            player.displayInfo();
            boss.displayInfo();

            battleMenu();

            int playerChoice = io.getInteger();

            switch (playerChoice) {

                case 1:
                    attack();
                    break;
            }

            if(player.getCurrentHealth() < 0) {
                io.displayMessage("Sorry! You lose.");
                return;
            }
            if(boss.getCurrentHealth() < 0) {
                io.displayMessage("Congrats, you win");
                return;
            }
        }
    }

    public void attack() {
        DamageCalc.calculateDamage(player, boss);
        DamageCalc.calculateDamage(boss, player);
    }


}
