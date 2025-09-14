package homework9;

// Класс Rabbit (Наследует от Animal)
public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Rabbit says: Squeak!");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equalsIgnoreCase(food)) {
            System.out.println("Rabbit loves eating grass!");
        } else {
            System.out.println("Rabbit is unhappy with " + food + "!");
        }
    }
}