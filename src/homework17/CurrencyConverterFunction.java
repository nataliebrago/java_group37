package homework17;

import java.util.Scanner;
import java.util.function.Function;

public class CurrencyConverterFunction {

    /**
     * Задача 3:
     * Используя Function реализовать лямбду, которая будет принимать в себя строку в
     * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     * возвращать сумму, переведенную сразу в доллары.
     */

    public static void currencyConverterMeth() {

        // Курс обмена: 1 BYN = 0.3 USD
        final double EXCHANGE_RATE = 0.3;

        // Создаём Scanner для чтения из консоли
        Scanner scanner = new Scanner(System.in);

        // Читаем входную строку от пользователя
        System.out.print("Введите сумму в формате 'сумма BYN' (например, '100 BYN'): ");
        String input1 = scanner.nextLine();

        // Function: принимает строку "сумма BYN", возвращает сумму в USD (Double)
        Function<String, Double> convertToUSD = input -> {
            // Разделяем строку по пробелу
            String[] parts = input.trim().split("\\s+");

            // Проверяем формат: должно быть ровно 2 части, вторая — "BYN"
            if (parts.length != 2 || !"BYN".equals(parts[1])) {
                System.out.println("Ошибка: Неверный формат строки. Ожидается 'сумма BYN'.");
                return 0.0;  // Или можно выбросить исключение
            }

            try {
                // Преобразуем первую часть в число
                double amount = Double.parseDouble(parts[0]);
                // Переводим в USD
                return amount * EXCHANGE_RATE;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Сумма не является числом.");
                return 0.0;
            }
        };

        try {
            // Применяем лямбду и выводим результат
            double resultUSD = convertToUSD.apply(input1);
            System.out.printf("Сумма в долларах: %.2f USD%n", resultUSD);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте снова.");
        } finally {
            scanner.close();  // Закрываем Scanner
        }
    }
}
