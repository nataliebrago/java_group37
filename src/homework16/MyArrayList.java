package homework16;

public class MyArrayList <T> {

    private Object[] elements; // внутренний массив, где реально хранятся элементы
    private int size; //  текущий размер коллекции (сколько элементов реально добавлено)
    private static final int DEFAULT_CAPACITY = 10; //стандартный начальный размер массива, равен 10

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Конструктор с инициализацией размера внутреннего массива
    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Размер должен быть больше нуля");
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    // Добавление элемента
    public void add(T element) {
        if (size == elements.length) {
            resize(); // если место закончилось — увеличиваем размер массива
        }
        elements[size++] = element;
    }

    // Удаление по индексу
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        T removed = (T) elements[index];
        // Сдвиг элементов влево
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Очистка ссылки
        return removed;
    }

    // Получение по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return (T) elements[index];
    }

    // Проверка наличия элемента
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    // Очистка коллекции
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // Текущий размер
    public int size() {
        return size;
    }

    // Метод для расширения
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements= newArray;
    }
}
