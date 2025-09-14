package homework9_1;

public class Dog1 {

    /**Написать такой конструктор, который запретит создание объекта класса Dog в других
    классах. Найти способ вызывать методы voice(), eat() класса Dog, который позволит
    обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
    способа.
     */

    /**Способ 1: Использовать статический метод внутри класса Dog*/

        private String name;

        // Приватный конструктор — запрещает создание вне класса
        private Dog1(String name) {
            this.name = name;
        }

        public void voice() {
            System.out.println(name + " говорит: ГАВ!");
        }

        public void eat() {
            System.out.println(name + " кушает.");
        }

        // Статический метод внутри класса для создания объекта
        public static Dog1 createDog(String name) {
            // Условное ограничение: например, только если name не пустой
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Некорректное имя. Попробуйте еще раз!");
            }
            return new Dog1(name);
        }
    }
