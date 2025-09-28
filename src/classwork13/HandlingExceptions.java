package classwork13;

public class HandlingExceptions {

    /**
     * Задача 1.1: Написать код, который выбросит ArrayIndexOutOfBoundsException. Обработать используя try-catch конструкцию.
     */

    public void arrayIndexOutOfBoundsExceptionMethod() {
        int[] array = {1, 2, 3};
        try {
            // Доступ к элементу за пределами массива
            System.out.println(array[5]);  // Это вызовет ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    /**
     * Задача 1.2: Добавить обработку арифметического исключения к предыдущему блоку try-catch используя множественные операторы.
     * Здесь расширяем try-блок, добавляя код, который может вызвать ArithmeticException (деление на ноль).
     * Для демонстрации используем условную логику, чтобы оба исключения могли произойти.
     */

    public void arithmeticExceptionMethod() {
        try {
            int[] array2 = {1, 2, 3};
            // Доступ к элементу за пределами массива
            System.out.println(array2[2]);  // ArrayIndexOutOfBoundsException
            // Или, если массив корректный, деление на ноль
            int divisor = 0;
            int result = 10 / divisor;  // ArithmeticException
            System.out.println("Результат: " + result);
        /*} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработано ArrayIndexOutOfBoundsException: " + e.getMessage())
         */
        } catch (ArithmeticException e) {
            System.out.println("Обработано ArithmeticException: " + e.getMessage());
        }
    }

    /**
     * Задача 1.3: Преобразовать множественные try-catch в мульти обработчик.
     * Используем multi-catch (введён в Java 7), где оба исключения ловятся в одном блоке с помощью оператора |.
     * Обратите внимание: в multi-catch переменная e будет иметь тип, общий для обоих исключений (здесь Exception).
     */

    public void exceptionMethods() {
        try {
            int[] array3 = {1, 2, 3};
            // Доступ к элементу за пределами массива
            System.out.println(array3[5]);  // ArrayIndexOutOfBoundsException
            // Или деление на ноль
            int divisor2 = 0;
            int result2 = 10 / divisor2;  // ArithmeticException
            System.out.println("Результат: " + result2);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Обработано исключение (ArrayIndexOutOfBoundsException или ArithmeticException): " + e.getMessage());
        }
    }
}
