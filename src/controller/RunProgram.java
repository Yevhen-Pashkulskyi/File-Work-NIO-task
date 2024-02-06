package controller;

import view.MenuAndOptional;

import java.util.Scanner;

public class RunProgram {
    public void run() {

        Scanner scanner = new Scanner(System.in);
        MenuAndOptional controller = new MenuAndOptional();
        controller.showMenu();

        int choice = scanner.nextInt();
        controller.choiceOption(choice);
    }
}
