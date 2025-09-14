package homework8_2;

public class Surgeon extends Doctor{
    @Override
    void treat() {
        System.out.println("Хирург лечит: проводит операции, когда консервативные методы неэффективны.");
    }
}
