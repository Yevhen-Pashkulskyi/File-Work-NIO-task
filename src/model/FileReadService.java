package model;

import utils.PathForFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public void readFile(String fileName) {
        Path path = Paths.get(PathForFiles.BASE_URL + fileName + ".txt");
        try {
            String text = Files.readString(path);
            System.out.print("Вміст файлу:\n" + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("Виникла помилка при зчитуванні файлу " + fileName + ".txt");
        }
    }
}
