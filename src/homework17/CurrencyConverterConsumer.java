package homework17;

import java.util.Scanner;
import java.util.function.Consumer;

public class CurrencyConverterConsumer {

    /**
     * Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
     * формате “сумма BYN”(через пробел, вместо "сумма" вставить любое значение), а
     * выводить сумму, переведенную сразу в доллары.
     */

    public static void currencyConverterConsumerMeth() {

        // Курс обмена: 1 BYN = 0.3 USD
        final double EXCHANGE_RATE = 0.3;

        // Создаём Scanner для чтения из консоли
        Scanner scanner = new Scanner(System.in);

        // Лямбда-функция, использующая Consumer<String> (принимает строку, ничего не возвращает, но выполняет вывод)
        Consumer<String> convertAndPrintUSD = input -> {

            try {
                // Разделяем строку по пробелу
                String[] parts = input.split(" ");
                if (parts.length != 2 || !parts[1].equals("BYN")) {
                    throw new IllegalArgumentException("Неверный формат строки. Ожидается: 'сумма BYN' ");
                }
                // Извлекаем сумму и конвертируем
                double amountBYN = Double.parseDouble(parts[0]);
                double amountUSD = amountBYN * EXCHANGE_RATE;

                // Выводим результат
                System.out.printf("Сумма в долларах: %.2f USD%n", amountUSD);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверный формат числа. Попробуйте снова.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте снова.");
            }
        };

        // Читаем входную строку от пользователя
        System.out.print("Введите сумму в формате 'сумма BYN': ");
        String input = scanner.nextLine();

        // Применяем Consumer (вызов accept выполняет лямбду)
        convertAndPrintUSD.accept(input);

        scanner.close();  // Закрываем Scanner
    }
}

