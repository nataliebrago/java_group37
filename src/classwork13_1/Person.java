package classwork13_1;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Возраст должен быть не моложе 18 лет, текущий: " + age);
        }
        this.age = age;
        this.name = name;
        System.out.println("Person создан с возрастом: " + age);
    }
        @Override
        public String toString () {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }