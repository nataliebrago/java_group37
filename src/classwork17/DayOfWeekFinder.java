package classwork17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekFinder {
    /**
     * Задача 1:
     * Написать программу для вывода на консоль названия дня недели по введенной дате.
     */

    public static void dayOfWeekFinderMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате yyyy-MM-dd: ");
        String input = scanner.nextLine();

        try {
            // Парсинг даты
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(input, formatter); // Парсит строку input в объект LocalDate по форматтеру. Если формат не совпадает, бросает исключение.

            // Получение дня недели
            String dayName = switch (date.getDayOfWeek()) { //Возвращает enum DayOfWeek (MONDAY, TUESDAY и т.д.) для даты.
                case MONDAY -> "Понедельник";
                case TUESDAY -> "Вторник";
                case WEDNESDAY -> "Среда";
                case THURSDAY -> "Четверг";
                case FRIDAY -> "Пятница";
                case SATURDAY -> "Суббота";
                case SUNDAY -> "Воскресенье";
            };

            System.out.println("День недели: " + dayName);
        } catch (Exception e) {
            System.out.println("Неверный формат даты. Используйте yyyy-MM-dd.");
        }
    }
}