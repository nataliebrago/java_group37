package homework11;

import java.util.Scanner;

public class MinMaxString {

    /**Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
    найденные строки и их длину.*/

    public void findMinMaxString() {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        // Инициализация самой короткой и длинной строк
        String shortest = strings[0];
        String longest = strings[0];

        // Поиск экстремумов
        for (int i = 1; i < 3; i++) {
            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }
        }
        System.out.println("Самая короткая строка: \"" + shortest + "\" длина: " + shortest.length());
        System.out.println("Самая длинная строка: \"" + longest + "\" длина: " + longest.length());

        scanner.close();
    }
}