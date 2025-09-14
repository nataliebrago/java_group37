package homework8_3;

public class Apple {

    /**Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple и, не
    используя сеттеры, изменить значение поля color.
     */

        private String color;

        public Apple(String color) {
            this.color = color;
        }

        public String getColor() { // Геттер, чтобы прочитать цвет (для проверки)
            return color;
        }
    }
