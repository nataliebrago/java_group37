package homework10;

import java.util.Objects;

public class UserSystem {

    /**
     * Задача 1:
     * Создать класс для описания пользователя системы. Переопределить в классе методы
     * toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
     * значением полей и сравнить с помощью метода equals.
     */
    private String login;
    private String email;
    private int age;

    public UserSystem(String login, String email, int age) {
        this.login = login;
        this.email = email;
        this.age = age;
    }

    // Переопределение toString() — возвращает строковое представление объекта
    @Override
    public String toString() {
        return "UserSystem{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    // Переопределение equals() — сравнивает объекты по значению полей
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;   // если сравниваем с самим собой
        if (o == null || getClass() != o.getClass()) return false; // проверка класса
        UserSystem userSystem = (UserSystem) o;
        return age == userSystem.age &&
                Objects.equals(login, userSystem.login) &&
                Objects.equals(email, userSystem.email);
    }

    // Переопределение hashCode() — должен быть согласован с equals()
    @Override
    public int hashCode() {
        return Objects.hash(login, email, age);
    }
}