package homework18;

import java.util.ArrayList;
import java.util.List;

public class StreamClass {

    /**Задача 1:
    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    Stream'ов: - Удалить дубликаты -Оставить только четные элементы - Вывести сумму оставшихся элементов в стриме
     */

    public static void streamClassMeth() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(22);
        list.add(22);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(0);
        list.add(77);

        // Используем Stream API: удаляем дубликаты, фильтруем четные, суммируем
        int sum = list.stream()
                .distinct()  // Удаляем дубликаты
                .filter(x -> x % 2 == 0)  // Оставляем только четные элементы
                .mapToInt(Integer::intValue)  // Преобразуем в IntStream для суммирования
                .sum();  // Суммируем оставшиеся элементы

        // Выводим результат
        System.out.println("Сумма четных уникальных элементов: " + sum);
    }
}
