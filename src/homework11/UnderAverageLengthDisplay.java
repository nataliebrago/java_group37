package homework11;

import java.util.Scanner;

public class UnderAverageLengthDisplay {

    /**
     * Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
     * средней, а также их длину.
     */

    public void underAverageLength() {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        int totalLength = 0;

        // Ввод трёх строк и подсчёт общей длины
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
            totalLength += strings[i].length();
        }

        // Вычисление средней длины
        double average = totalLength / 5.0;
        System.out.println("Средняя длина: " + average);

        System.out.println("Строки с длиной меньше средней:");
        for (String s : strings) {
            if (s.length() < average) {
                System.out.println("\"" + s + "\" (длина: " + s.length() + ")");
            }
        }
    }
}
