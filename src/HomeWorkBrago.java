import homework1.Operators;
import homework2.WhileForLoops;
import homework4.OneDimensionalArrays;
import homework5.MultidimensionalArrays;
import homework6.CreditCard;
import homework6.SberATM;
import homework7.Accountant;
import homework7.Director;
import homework7.Position;
import homework7.Worker;
import homework7_1.Circle;
import homework7_1.Rectangle;
import homework7_1.Shape;
import homework7_1.Triangle;

public class HomeWorkBrago {

    public static void main(String[] args) {

        /*Operators mOperators = new Operators(); // Создали экземпляр класса HomeWork1 в классе HomeWorkBrago

        mOperators.task1(8, 3);
        mOperators.task2(31);
        mOperators.task3(318);
        mOperators.task4(5.2);
        mOperators.task5(23, 4);
        mOperators.task6(5, 4);
        mOperators.task7(5,6);

        WhileForLoops mWhileForLoops = new WhileForLoops();
        mWhileForLoops.task8();
        mWhileForLoops.task9();
        mWhileForLoops.task10();
        mWhileForLoops.task11();
        mWhileForLoops.task12();*/

        /*OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
        oneDimensionalArrays.task13();
        oneDimensionalArrays.findMinMax();
        oneDimensionalArrays.findMinMaxIndices();
        oneDimensionalArrays.countZeroElements();
        oneDimensionalArrays.reverseArray();
        oneDimensionalArrays.isIncreasingSequence();
        oneDimensionalArrays.addOneTask();*/


        /*MultidimensionalArrays mMultidimensionalArrays = new MultidimensionalArrays();
        mMultidimensionalArrays.arraySum();
        mMultidimensionalArrays.chessBoard();
        mMultidimensionalArrays.snakeArray();*/

       /* CreditCard card1 = new CreditCard("4318031064636909", 714.0);
        CreditCard card2 = new CreditCard("4083441871698708", 572.0);
        CreditCard card3 = new CreditCard("4083445536007015", 663.0);
        card1.depositMoney(200.2);
        card2.depositMoney(122.55);
        card3.withdrawMoney(500);
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
        */

        /*Создаем СБЕР банкомат с начальными купюрами
        SberATM atm = new SberATM(2,2, 2);  // 10x20, 5x50, 3x100 (общий баланс: 200+250+300=750)

        // Добавляем деньги
        atm.addMoney(0, 0, 0);  // Добавим 2x20, 1x50, 1x100

        // Пытаемся снять деньги
        boolean success1 = atm.withdraw(200);  // Должно выдать: 3x100 (true)
        boolean success2 = atm.withdraw(50);  // Должно выдать: 1x100, 1x50 (true)
        boolean success3 = atm.withdraw(1000); // Недостаточно средств (false)
        boolean success4 = atm.withdraw(45);   // Невозможно выдать (не делится на номиналы, false)

        // Выводим статус
        atm.displayStatus();*/

        /*Position director = new Director();  // Создание объекта Director как Position (полиморфизм).
        Position worker = new Worker();      // Создание объекта Worker.
        Position accountant = new Accountant();  // Создание объекта Accountant.

        director.printPosition();    // Вызывает метод для Director: печатает "Директор".
        worker.printPosition();      // Вызывает метод для Worker: печатает "Рабочий".
        accountant.printPosition();  // Вызывает метод для Accountant: печатает "Бухгалтер".
         */

        // Создаём массив из 5 фигур

        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);          // Прямоугольный треугольник
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(5);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(2, 3);

        // Подсчёт суммы периметров
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }

        System.out.printf("Сумма периметров всех фигур: %.2f%n", totalPerimeter);
    }
}

