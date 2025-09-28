package homework13;

// Пользовательский класс исключения для неверного пароля
public class WrongPasswordException extends  Exception {
    // Конструктор по умолчанию
    public WrongPasswordException() {
        super();
    }

    // Конструктор с сообщением
    public WrongPasswordException(String message) {
        super(message);
    }
}
