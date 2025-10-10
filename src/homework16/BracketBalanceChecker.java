package homework16;

import java.util.Stack;

public class BracketBalanceChecker {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>(); //пустой стек, который будет хранить символы открывающих скобок ('(', '[', '{)

        /** Выбрали стек, потому что он позволяет быстро "снимать" последнюю добавленную скобку,
         когда встречается закрывающая. Это ключ к проверке порядка.
         */

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Нет соответствующей открывающей
                }
                char top = stack.pop(); //Снимаем верхний элемент стека (последнюю открывающую скобку) и сохраняем в top
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false; // Несоответствие
                }
            }
            // Игнорируем другие символы, если они есть
        }

        // Если стек пустой — все скобки сбалансированы
        return stack.isEmpty();
    }
}