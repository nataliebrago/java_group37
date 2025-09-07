package homework7_2;

/**
 * Cloneable — это интерфейс-маркер, то есть он не содержит методов.
 * Его задача — сообщить JVM и методу clone(), что объекты этого класса можно клонировать.
 * Если класс не реализует Cloneable, вызов clone() у объекта этого класса вызовет исключение CloneNotSupportedException.
 */
public class MyCat implements Cloneable {
    private String name;
    private int age;

    public MyCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Переопределение метода clone()
     * Метод clone() — это защищённый метод класса Object, который создаёт копию объекта.
     * Мы переопределяем его, чтобы сделать публичным и возвращать объект типа Person.
     * Внутри вызывается super.clone() — метод clone() из класса Object.
     */

    @Override
    public MyCat clone() {
        try {
            return (MyCat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    //Метод toString() возвращает строковое представление объекта
    @Override
    public String toString() {
        return "MyCat{name='" + name + "', age=" + age + "}";
    }
}
