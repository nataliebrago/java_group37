package homework13;

public class NotFinallyMethod {

    public void notFinallyMethod() {
        try {
            System.out.println("В блоке try");
            System.exit(0);  // Завершает программу немедленно
        } catch (Exception e) {
            System.out.println("В блоке catch");
        } finally {
            System.out.println("В блоке finally");  // Это НЕ ВЫПОЛНИТСЯ
        }
    }
}
