package classwork_8;

public class Build {

    /**Задача 1:
    Создать класс Build с одним полем type. Создать 2-х наследников этого класса– House
    и Garage, в которых при создании в конструкторе будет присваиваться в поле type
    значения “House” и “Garage” соответственно. В методе main другого класса создать
    объекты House и Garage классов. Продемонстрировать значения полей этих классов
    используя геттеры.
     */

    private String type;

    public Build(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
