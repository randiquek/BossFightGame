package com.bossfight.controller;

import com.bossfight.model.Boss;
import com.bossfight.model.Player;
import com.bossfight.view.ConsoleIO;

public class MenuController {
    ConsoleIO io;
    Player player;
    Boss boss;
    boolean isRunning = false;
    String playerName;

    public MenuController(ConsoleIO io, Player player, Boss boss) {
        this.io = io;
        this.player = player;
        this.boss = boss;
    }

    public void runGame() {
        boolean isRunning = true;

        while(isRunning) {
            io.displayMessage("Welcome to The Boss Fight");
            playerName = io.getPlayerInput("Enter your player name: ");
            io.displayMessage("Hello, " + playerName);
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

            render();
        }
    }

    public void printGameMenu() {
        io.displayMessage("----Game Menu----");
        io.displayMessage("1. Start New Game");
        io.displayMessage("2. Quit");
    }

    public void startGame() {
        io.displayMessage("Game starting...");
    }

    public void render() {
        io.displayMessage("You attack first");
        player.displayPlayerInfo();

    }

}
