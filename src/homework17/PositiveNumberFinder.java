package homework17;

import java.util.Arrays;
import java.util.function.Predicate;

public class PositiveNumberFinder {

    /**
     * Задача 2:
     * Используя Predicate среди массива чисел вывести только те, которые являются
     * положительными.
     */

    public static void positiveNumberFinderMeth() {

        int[] numbers = {-1, 5, 0, -2, 4, 12};

        // Создаём Predicate для проверки, является ли число положительным
        Predicate<Integer> isPositive = n -> n > 0;

        // Фильтруем массив и выводим только положительные числа
        System.out.println("Положительные числа:");
        Arrays.stream(numbers)
                .filter(isPositive::test)  // Фильтруем с помощью Predicate
                .forEach(System.out::println);  // Выводим каждый элемент
    }
}
