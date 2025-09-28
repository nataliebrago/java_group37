package homework13;

// Пользовательский класс исключения для неверного логина
public class WrongLoginException extends Exception {
    // Конструктор по умолчанию
    public WrongLoginException() {
        super();
    }

    // Конструктор с сообщением
    public WrongLoginException(String message) {
        super(message);
    }
}
