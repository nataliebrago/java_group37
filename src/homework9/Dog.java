package homework9;

// Класс Dog (Наследует от Animal)
public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog says: Woof!");
    }
    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Dog loves eating meat!");
        } else {
            System.out.println("Dog is unhappy with " + food + "!");
        }
    }
}
