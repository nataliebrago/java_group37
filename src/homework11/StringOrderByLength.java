package homework11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class StringOrderByLength {

    /**Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
     значений их длины.*/

    public void sortStringLength(){
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Сортируем строки по длине
        Arrays.sort(strings, Comparator.comparingInt(String::length)); //Компаратор сравнивает длины строк и сортирует массив по возрастанию

        System.out.println("Строки, отсортированные по длине:");
        for (String s : strings) {
            System.out.println("\"" + s + "\" длина: " + s.length());
        }
    }
}
