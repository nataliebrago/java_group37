package homework6;

public class SberATM {

    /**Задача *:
     Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
     задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
     метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
     принимает сумму денег, а возвращает булевое значение - успешность выполнения
     операции. При снятии денег, функция должна распечатывать каким количеством купюр
     какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
     количеством купюр каждого номинала
     */
    private int countOfNote20;  // Количество купюр номиналом 20
    private int countOfNote50;  // Количество купюр номиналом 50
    private int countOfNote100; // Количество купюр номиналом 100

    // Конструктор с тремя параметрами - количеством купюр каждого номинала
    public SberATM(int countOfNote20, int countOfNote50, int countOfNote100) {
        this.countOfNote20 = countOfNote20;
        this.countOfNote50 = countOfNote50;
        this.countOfNote100 = countOfNote100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int countOfNote20, int countOfNote50, int countOfNote100) {
        if (countOfNote20 < 0 || countOfNote50 < 0 || countOfNote100 < 0) {
            System.out.println("Количество купюр не может быть отрицательным.");
            return;
        }
        this.countOfNote20 += countOfNote20;
        this.countOfNote50 += countOfNote50;
        this.countOfNote100 += countOfNote100;
        System.out.println("Добавлено: " + countOfNote20 + " купюр (ы) по 20, " + countOfNote50 + " по 50, " + countOfNote100 + " по 100.");
    }

    // Метод для снятия денег: возвращает true/false, печатает купюры
    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной.");
            return false;
        }

        // Рассчитываем общий баланс банкомата
        int totalMoney = 20 * countOfNote20 + 50 * countOfNote50 + 100 * countOfNote100;
        if (amount > totalMoney) {
            System.out.println("Недостаточно средств в банкомате.");
            return false;
        }
        // Жадный алгоритм: сначала максимально 100, затем 50, затем 20
        int num100 = Math.min(amount / 100, countOfNote100);
        amount -= num100 * 100;

        int num50 = Math.min(amount / 50, countOfNote50);
        amount -= num50 * 50;

        int num20 = Math.min(amount / 20, countOfNote20);
        amount -= num20 * 20;

        // Если остался остаток, значит сумма не может быть выдана точно
        if (amount > 0) {
            System.out.println("Невозможно выдать сумму купюрами данного номинала.");
            return false;
        }

        // Вычитаем купюры и печатаем результат
        countOfNote100 -= num100;
        countOfNote50 -= num50;
        countOfNote20 -= num20;
        System.out.println("Выдано: " + num100 + " купюр по 100, " + num50 + " по 50, " + num20 + " по 20.");
        return true;
    }

    // Дополнительный метод для вывода текущего состояния
    public void displayStatus() {
        int totalMoney = 20 * countOfNote20 + 50 * countOfNote50 + 100 * countOfNote100;
        System.out.println("Купюры: 20 - " + countOfNote20 + ", 50 - " + countOfNote50 + ", 100 - " + countOfNote100 + ". Общий баланс: " + totalMoney);
    }
}
