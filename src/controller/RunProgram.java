package controller;

import view.MenuAndOptional;
import model.FileReadService;
import model.FileWriteService;

import java.util.Scanner;

public class RunProgram {
    public void run() {
//        FileReadService fileReadService = new FileReadService();
//        FileWriteService fileWriteService = new FileWriteService();
        Scanner scanner = new Scanner(System.in);
        MenuAndOptional controller = new MenuAndOptional();

        controller.showMenu();

        int choice = scanner.nextInt();
//        while (choice != 0) {
//            controller.choiceOption(choice);
//            System.out.println();
//            controller.showMenu();
//
//            choice = scanner.nextInt();
//        }
//        scanner.close();
//        System.out.println("Програма завершена.");
        controller.choiceOption(choice);
    }
}
