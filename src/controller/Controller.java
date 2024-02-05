package controller;

import model.FileReadService;
import model.FileWriteService;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. Створити та записати");
        System.out.println("2. Зчитати");
        System.out.println("0. Вичід");
    }

    public void choiceOption(int choice) {
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
