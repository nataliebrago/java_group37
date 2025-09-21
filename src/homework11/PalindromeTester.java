package homework11;

import java.util.Scanner;

public class PalindromeTester {

    /**
     * Дана строка произвольной длины с произвольными словами. Написать программу для
     * проверки является ли любое выбранное слово в строке палиндромом.
     * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
     * слово в этой строке палиндромом.
     * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
     * в строке 5 слов, а на вход программе передали число 500.
     */

    public void palindromeTesterMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputLine = scanner.nextLine().trim();

        if (inputLine.isEmpty()) {
            System.out.println("Ошибка: введена пустая строка.");
            return;
        }

        // Разбиваем строку на слова по пробелам
        String[] words = inputLine.trim().split("\\s+");

        System.out.println("В строке найдено " + words.length + " слов(а).");
        System.out.print("Введите номер слова для проверки на палиндром: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не число.");
            return;
        }

        int wordIndex = scanner.nextInt();

        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: в строке " + words.length + " слов(а), а введено число " + wordIndex + ".");
            return;
        }

        String wordToCheck = words[wordIndex - 1];  // Нумерация с 1

        if (isPalindrome(wordToCheck)) {
            System.out.println("Слово \"" + wordToCheck + "\" является палиндромом.");
        } else {
            System.out.println("Слово \"" + wordToCheck + "\" не является палиндромом.");
        }
    }

        public boolean isPalindrome (String str){
            String lower = str.toLowerCase();
            int left = 0;
            int right = lower.length() - 1;

            while (left < right) {
                if (lower.charAt(left) != lower.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }