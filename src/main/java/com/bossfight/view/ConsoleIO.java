package com.bossfight.view;

import java.util.Scanner;

public class ConsoleIO {

    private Scanner console = new Scanner(System.in);

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayPrompt(String prompt) {
        System.out.println(prompt);
    }

    public String getPlayerInput(String prompt) {
        displayPrompt(prompt);
        return console.nextLine();
    }
}
