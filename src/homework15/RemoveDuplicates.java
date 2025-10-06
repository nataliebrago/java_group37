package homework15;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public void removeDuplicatesMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую (например: 1, 2, 3, 4):");
        String input = scanner.nextLine();

        // Разделяем строку по запятой и убираем пробелы
        String[] parts = input.split(",\\s*");

        // Используем LinkedHashSet для удаления дубликатов с сохранением порядка
        LinkedHashSet<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(parts));

        //Объединяем обратно в строку через запятую и пробел
        String result = String.join(",",uniqueNumbers);

        System.out.println("Результат без дубликатов: " + result);
    }
}