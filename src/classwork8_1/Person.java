package classwork8_1;

public class Person {

    /**Задача 2:
    Создать класс Person с полями name, age, gender. Поле name сделать public, age
    оставить по дефолту, gender – private. В классе Main создать объект Person.
    Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
    используя геттеры и поля если это возможно.
     */

    public String name;      // Публичное поле
    int age;          //Поле по умолчанию (package-private)
    private String gender;   // Приватное поле

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
