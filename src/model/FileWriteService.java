package model;

import utils.PathForFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public void  createAndWriTeFile(String fileName, String text) {
        Path path = Paths.get(PathForFiles.BASE_URL + fileName + ".txt");
        try {
            Files.createFile(path);
            Files.writeString(path, text);
            System.out.println("Файл " + fileName + ".txt" + " успішно створенний та записаний.");

        } catch (IOException e) {
            System.out.println("Виникла помилка при роботі з файлом " + fileName + ".txt");
        }
    }
}
