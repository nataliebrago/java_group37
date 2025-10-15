package homework18;

import java.util.*;
import java.util.stream.Collectors;

public class FilterAndReverseNames {

    /**
     * Задача *:
     * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать
     * из этого набора только те данные, id которых попадает в числовой диапазон
     * 1/2/5/8/9/13. Среди отобранных значений отобрать только те, которые имеют нечетное
     * количество букв в имени. После чего вернуть список List имен, записанных буквами
     * задом наперед
     */
    public static void filterAndReverseMeth () {

        // Создаём Map с данными (id - name)
        // Map.of() создает неизменяемую Map (Java 9+)
        Map<Integer, String> data = Map.of(
                1, "Anna",    // Замена: была "Alice" (длина: 4, чётная → теперь не пройдёт фильтр по нечётной длине!)
                2, "Boris",   // Замена: была "Bob" (длина: 5, нечётная)
                3, "Clara",   // Замена: была "Charlie" (длина: 6, чётная)
                5, "Denis",   // Замена: была "David" (длина: 5, нечётная)
                8, "Emma",    // Замена: была "Eve" (длина: 4, чётная)
                9, "Felix",   // Замена: была "Frank" (длина: 5, нечётная)
                10, "Lina",   // Замена: была "Grace" (длина: 4, чётная)
                13, "Hanna"   // Замена: была "Helen" (длина: 5, нечётная)
        );

        // Набор id для фильтрации: Set для быстрой проверки contains()
        // Если id динамические, можно List.of(1,2,5,8,9,13).contains(), но Set быстрее
        Set<Integer> allowedIds = Set.of(1, 2, 5, 8, 9, 13);

        // Обработка с помощью Streams
        // entrySet() возвращает множество пар (Entry), каждая с getKey() и getValue(). stream() создает Stream из этих пар
        List<String> result = data.entrySet().stream()

                //Для каждой пары проверяем, есть ли ключ в allowedIds. Если да, пара проходит дальше
                .filter(entry -> allowedIds.contains(entry.getKey()))  // Фильтр по id

                //Второй фильтр. Проверяем, что имя не null (чтобы избежать NullPointerException) и длина нечетная. % 2 != 0
                .filter(entry -> entry.getValue().length() % 2 != 0)   // Фильтр по нечетной длине имени

                // Преобразование. Для каждой пары берем имя, создаем StringBuilder (эффективный для манипуляций строк), вызываем reverse() (переставляет символы), и конвертируем в String. Результат — новая строка, оригинал не меняется
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())  // Переворот имени

                .sorted(String.CASE_INSENSITIVE_ORDER)  // Сортировка по алфавиту (без учёта регистра)

                //Терминальная операция. Собирает все прошедшие элементы в новый List<String>. Без этого Stream не выполнится (ленивость)
                .collect(Collectors.toList());  // Сбор в список

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}
