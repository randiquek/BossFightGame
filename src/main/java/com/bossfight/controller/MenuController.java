package com.bossfight.controller;

import com.bossfight.view.ConsoleIO;

public class MenuController {
    ConsoleIO io;
    boolean isRunning = false;

    public MenuController(ConsoleIO io) {
        this.io = io;
    }

    public void runGame() {
        boolean isRunning = true;

        while(isRunning) {
            io.displayMessage("Welcome to The Boss Fight");
            break;
        }
    }

}
