package homework5;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrays {

    /*Задача 1:
    1.1 Создать двумерный массив, заполнить его случайными числами.
            1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
            1.3 Найти сумму всех получившихся элементов и вывести в консоль
     */

    public void arraySum() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1.1 Создаем двумерный массив (например, 4x4)
        int rows = 4;
        int cols = 4;
        int[][] array = new int[rows][cols];

        // Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // 1.2 Запрашиваем число у пользователя
        System.out.print("Введите число, которое нужно прибавить к каждому элементу: ");
        int addNumber = scanner.nextInt();

        // 1.3 Добавляем число к каждому элементу массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] += addNumber;
            }
        }

        // Находим сумму всех элементов
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        // Выводим обновленный массив
        System.out.println("Массив после прибавки:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Выводим сумму
        System.out.println("Сумма всех элементов после прибавки: " + sum);
    }


/*
Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть
следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
 */

    public void chessBoard() {
        String[][] board = new String[8][8];

        // Заполняем массив значениями "W" и "B" по шахматному шаблону
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Если сумма индексов четная, ставим "W", иначе "B"
               if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }
        // Выводим доску
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*Задача *:
    Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    Формат входных данных:
    Программа получает на вход два числа n и m.
    Формат выходных данных:
    Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    символа.
     */
    public void snakeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        /* /*Считываем два целых числа n и m из входных данных.
        Эти числа задают размеры массива: n — количество строк, m — количество столбцов.*/

        int[][] A = new int[n][m];
        int num = 0;
        /*Объявляем переменную num, которая будет использоваться для последовательного заполнения массива числами от 1 до n*m.*/

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Заполняем слева направо
                for (int j = 0; j < m; j++) {
                    A[i][j] = num++;
                }
            } else {
                // Заполняем справа налево
                for (int j = m - 1; j >= 0; j--) {
                    A[i][j] = num++;
                }
            }
        }

        // Вывод массива с форматированием
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
}