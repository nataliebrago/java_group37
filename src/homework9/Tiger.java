package homework9;

// Класс Tiger (Наследует от Animal)
public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger says: Roar!");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Tiger loves eating meat!");
        } else {
            System.out.println("Tiger is unhappy with " + food + "!");
        }
    }
}
