package homework6;

public class CreditCard {

    /**Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    выводит текущую информацию о карточке. Напишите программу, которая создает три
    объекта класса CreditCard,у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    третьей. Выведите на экран текущее состояние всех трех карточек.
     */
    private final String accountNumber;  // Номер счета
    private double balance;// Текущая сумма на счету

    // Конструктор для создания карты с номером и начальным балансом
    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

        // Метод для начисления денег на карту
        public void depositMoney(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("На карту " + accountNumber + " зачислено: " + amount);
            } else {
                System.out.println("Сумма для зачисления должна быть положительной.");
            }
        }

        // Метод для снятия денег с карты
        public void withdrawMoney(double amount) {
            if (amount <= 0) {
                System.out.println("Сумма для снятия должна быть положительной.");
            } else if (amount > balance) {
                System.out.println("Недостаточно средств на карте " + accountNumber + " для снятия " + amount);
            } else {
                balance -= amount;
                System.out.println("Со счета " + accountNumber + " снято: " + amount);
            }
        }

        // Метод для вывода текущей информации о карте
        public void displayInfo() {
            System.out.printf("Карта %s: текущий баланс = %.2f%n", accountNumber, balance);
        }
    }
