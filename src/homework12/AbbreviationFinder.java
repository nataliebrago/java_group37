package homework12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationFinder {

    /**
     * Вывести в консоль из строки, которую пользователь вводит с клавиатуры, все
     * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
     * только из прописных букв, без чисел.
     */

    public void abbreviationFinderMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Разбиваем строку на слова (учитываем пробелы, запятые и т.д.)
        String[] words = input.split("\\s+|[,;.!?]+");

        HashSet<String> abbreviations = new HashSet<>();

        // Регулярное выражение для аббревиатур: слово из 2-6 прописных букв
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");

        for (
                String word : words) {
            // Убираем возможные лишние символы (например, кавычки)
            word = word.replaceAll("[\"'()]", "");

            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                abbreviations.add(word);
            }
        }

        // Выводим результат
        if (abbreviations.isEmpty()) {
            System.out.println("Аббревиатур не найдено.");
        } else {
            System.out.println("Найденные аббревиатуры: " + String.join(" ", abbreviations));
        }

        scanner.close();
    }
}
