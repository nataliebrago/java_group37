package homework15;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals =  new LinkedList<>();

    // Добавление животного в начало коллекции
    public void addAnimal(String name) {
        if (name != null && !name.trim().isEmpty()) {
            animals.addFirst(name);
            System.out.println("Добавлено в начало: " + name);
        } else {
            System.out.println("Ошибка: некорректное имя животного.");
        }
    }

    // Удаление животного из конца коллекции
    public void removeAnimal() {
        if (!animals.isEmpty()) {
            String removed = animals.removeLast();
            System.out.println("Удалено из конца: " + removed);
        } else {
            System.out.println("Коллекция пуста, нечего удалять.");
        }
    }

    public LinkedList<String> getAnimals() {
        return animals;
    }
}
