package controller;

import view.MenuAndOptional;

import java.util.Scanner;

public class RunProgram {
    public void run() {

        Scanner scanner = new Scanner(System.in);
        MenuAndOptional menuAndOtional = new MenuAndOptional();
        menuAndOtional.showMenu();

        int choice = scanner.nextInt();
        menuAndOtional.choiceOption(choice);
    }
}
