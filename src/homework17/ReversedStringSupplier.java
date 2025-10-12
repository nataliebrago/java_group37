package homework17;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReversedStringSupplier {

    /**
     * Используя Supplier написать метод, который будет возвращать введенную с консоли
     * строку задом наперед
     */

    // Метод, который возвращает Supplier<String>, читающий строку с консоли и возвращающий её задом наперед
    public static Supplier<String> getReversedStringSupplier() {
        return () -> {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            // Закрываем Scanner
            scanner.close();

            // Возвращаем строку задом наперед
            return new StringBuilder(input).reverse().toString();
        };
    }
}

