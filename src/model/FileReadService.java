package model;

import utils.PathForFiles;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public  String readFile(String fileName) {
        try {
            Path path = Paths.get(PathForFiles.BASE_URL + fileName + ".txt");
            String text = Files.readString(path);
//            System.out.print("Вміст файлу:" + fileName + ".txt\n\n");
//            System.out.println(text);
            return text;
        } catch (IOException e) {
            System.out.println("Виникла помилка при зчитуванні файлу " + fileName + ".txt");
            return null;
        }
    }
}
