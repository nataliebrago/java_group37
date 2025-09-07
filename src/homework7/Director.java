package homework7;

public class Director implements Position  {
    // Переопределение метода из интерфейса. @Override указывает, что это реализация интерфейсного метода.
    @Override
    public void printPosition() {
        System.out.println("Директор");
    }
}
