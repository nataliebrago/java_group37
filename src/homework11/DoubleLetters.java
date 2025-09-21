package homework11;

public class DoubleLetters {

    /**
     * Вывести на консоль новую строку, которой задублирована каждая буква из
     * начальной строки. Например, "Hello" -> "HHeelllloo".
     */

    public void doubleLettersMethod() {
        String input = "Кот Сеня";              // Исходная строка, которую будем обрабатывать
        StringBuilder doubled = new StringBuilder();  // Создаём объект для эффективного построения новой строки

        // Проходим по каждому символу исходной строки
        for (char c : input.toCharArray()) {
            doubled.append(c).append(c);    // Добавляем текущий символ дважды в StringBuilder
        }

        // Выводим результат на консоль
        System.out.println(doubled.toString());  // Преобразуем StringBuilder в строку и печатаем
    }
}
