package classwork13_1;

// Шаг 1. Собственное исключение
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
