package controller;

import model.FileReadService;
import model.FileWriteService;

import java.util.Scanner;

public class Controller {

    public void showMenu() {
        System.out.println("1. Створити та записати файл");
        System.out.println("2. Зчитати файл");
//        System.out.println("0. Вихід з програми");

        System.out.print("Виберіть пункт із меню: ");
    }

    public void choiceOption(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("ВВедіть назву файлу (без розширення):");
                String fileName = scanner.next();

                System.out.println("Введіть текст для  запису в файл:");
                scanner.nextLine();
                String text = scanner.nextLine();
                FileWriteService.createAndWriTeFile(fileName, text);
                break;
            case 2:
                System.out.println("ВВедіть назву файлу (без розширення):");
                fileName = scanner.next();
                FileReadService.readFile(fileName);
                break;
            default:
                System.out.println("Невірний вибір. Спробуйте ще.");
        }
        scanner.close();
    }

}
