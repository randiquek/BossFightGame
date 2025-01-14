package com.bossfight;

import com.bossfight.controller.MenuController;
import com.bossfight.view.ConsoleIO;

public class GameApp {
    public static void main(String[] args) {

        ConsoleIO io = new ConsoleIO();
        MenuController gameMenu = new MenuController(io);

        gameMenu.runGame();
    }




}