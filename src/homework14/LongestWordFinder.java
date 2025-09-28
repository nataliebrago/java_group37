package homework14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordFinder {

    public String findLongestWord(String fileName) {
        String longestWord = null;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String rawWord = scanner.next();
                // Очищаем слово от знаков препинания и приводим к нижнему регистру
                String word = rawWord.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!word.isEmpty() && (longestWord == null || word.length() > longestWord.length())) {
                    longestWord = word;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + fileName);
            return null;
        }
        return longestWord;
    }

    public void writeToFile(String fileName, String word) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(word);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + fileName);
        }
    }
}
