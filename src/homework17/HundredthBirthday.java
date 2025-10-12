package homework17;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HundredthBirthday {

    /**
     * Задача 1:
     * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
     * когда пользователю исполнится 100 лет. Использовать Date/Time API.
     */

    public static void hundredthBirthdayMeth() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату рождения в формате yyyy-MM-dd: ");
        String input = scanner.nextLine();

        try {
            // Парсим введённую строку в LocalDate
            LocalDate birthDate = LocalDate.parse(input);

            // Добавляем 100 лет к дате рождения
            LocalDate hundredthBirthday = birthDate.plusYears(100);

            // Выводим результат
            System.out.println("Дата, когда вам исполнится 100 лет: " + hundredthBirthday);
        } catch (DateTimeParseException e) {
            // Обработка ошибки, если формат даты неправильный
            System.out.println("Ошибка: Неверный формат даты. Используйте yyyy-MM-dd (например, 1994-12-20).");
        }

        scanner.close();
    }
}
