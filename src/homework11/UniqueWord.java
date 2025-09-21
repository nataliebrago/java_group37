package homework11;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWord {

    /**
     * Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
     * Если таких слов несколько, найти первое из них.
     */

    public void uniqueWordMethod() {
        Scanner sc = new Scanner(System.in); //Создаём сканер для чтения ввода с консоли (System.in — стандартный ввод)
        String[] words = new String[4]; //   // Массив для хранения 4 строк
        for (int i = 0; i < 4; i++) { // Цикл ввода: 4 итерации (i от 0 до 3)
            System.out.println("Введите строки:");
            words[i] = sc.nextLine(); //Читаем строку с консоли и сохраняем в массив. nextLine() берёт всю строку, включая пробелы
        }

        // Проверяем каждое слово по порядку
        for (String word : words) {
            HashSet<Character> uniqueChars = new HashSet<>(); //Создаём новый пустой HashSet для символов (<Character> — тип, new HashSet<>() — конструктор)
            boolean unique = true; // Флаг: true, если слово уникально (пока не нашли дубликатов)
            for (char c : word.toCharArray()) { //Array()) {  // Внутренний цикл: word.toCharArray() превращает строку в массив символов (например, "abc" → ['a', 'b', 'c'])
                if (!uniqueChars.add(c)) { /* uniqueChars.add(c): добавляем символ c в набор.
                    add() возвращает false, если c уже в наборе (дубликат).
                    ! — инверсия: если add() вернул false, значит дубликат найден.
                    unique = false;
                    break;*/
                }
            }
            if (unique) {    // Если флаг остался true (нет дубликатов)
                System.out.println("Первое слово с уникальными символами: \"" + word + "\"");
                return;  // Останавливаемся на первом
            }
        }
        System.out.println("Нет слов с уникальными символами.");
    }
}