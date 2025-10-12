import homework17.CurrencyConverterConsumer;
import homework17.CurrencyConverterFunction;
import homework17.ReversedStringSupplier;

import java.util.function.Supplier;

import static homework17.ReversedStringSupplier.getReversedStringSupplier;

public class HomeWorkBrago {

    public static void main(String[] args) {

        /*Operators mOperators = new Operators(); // Создали экземпляр класса HomeWork1 в классе HomeWorkBrago

        mOperators.task1(8, 3);
        mOperators.task2(31);
        mOperators.task3(318);
        mOperators.task4(5.2);
        mOperators.task5(23, 4);
        mOperators.task6(5, 4);
        mOperators.task7(5,6);

        WhileForLoops mWhileForLoops = new WhileForLoops();
        mWhileForLoops.task8();
        mWhileForLoops.task9();
        mWhileForLoops.task10();
        mWhileForLoops.task11();
        mWhileForLoops.task12();*/

        /*OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
        oneDimensionalArrays.task13();
        oneDimensionalArrays.findMinMax();
        oneDimensionalArrays.findMinMaxIndices();
        oneDimensionalArrays.countZeroElements();
        oneDimensionalArrays.reverseArray();
        oneDimensionalArrays.isIncreasingSequence();
        oneDimensionalArrays.addOneTask();*/


        /*MultidimensionalArrays mMultidimensionalArrays = new MultidimensionalArrays();
        mMultidimensionalArrays.arraySum();
        mMultidimensionalArrays.chessBoard();
        mMultidimensionalArrays.snakeArray();*/

       /* CreditCard card1 = new CreditCard("4318031064636909", 714.0);
        CreditCard card2 = new CreditCard("4083441871698708", 572.0);
        CreditCard card3 = new CreditCard("4083445536007015", 663.0);
        card1.depositMoney(200.2);
        card2.depositMoney(122.55);
        card3.withdrawMoney(500);
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
        */

        /*Создаем СБЕР банкомат с начальными купюрами
        SberATM atm = new SberATM(2,2, 2);  // 10x20, 5x50, 3x100 (общий баланс: 200+250+300=750)

        // Добавляем деньги
        atm.addMoney(0, 0, 0);  // Добавим 2x20, 1x50, 1x100

        // Пытаемся снять деньги
        boolean success1 = atm.withdraw(200);  // Должно выдать: 3x100 (true)
        boolean success2 = atm.withdraw(50);  // Должно выдать: 1x100, 1x50 (true)
        boolean success3 = atm.withdraw(1000); // Недостаточно средств (false)
        boolean success4 = atm.withdraw(45);   // Невозможно выдать (не делится на номиналы, false)

        // Выводим статус
        atm.displayStatus();*/

        /*
        Position director = new Director();  // Создание объекта Director как Position (полиморфизм).
        Position worker = new Worker();      // Создание объекта Worker.
        Position accountant = new Accountant();  // Создание объекта Accountant.

        director.printPosition();    // Вызывает метод для Director: печатает "Директор".
        worker.printPosition();      // Вызывает метод для Worker: печатает "Рабочий".
        accountant.printPosition();  // Вызывает метод для Accountant: печатает "Бухгалтер".
         */

        // Создаём массив из 5 фигур

        /*
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);          // Прямоугольный треугольник
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(5);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(2, 3);

        // Подсчёт суммы периметров
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }

        System.out.printf("Сумма периметров всех фигур: %.2f%n", totalPerimeter);


        MyCat original = new MyCat("Сеня", 11);
        MyCat copy = original.clone();

        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);


 Сравниваем объекты по ссылке с помощью ==:
 original == copy вернёт false, потому что это два разных объекта в памяти.
 Это доказывает, что clone() создал новый объект, а не просто скопировал ссылку

        System.out.println("Оригинал == Копия? " + (original == copy));
         */

        /*House house = new House();
        Garage garage = new Garage();

        System.out.println("Тип объекта house: " + house.getType());
        System.out.println("Тип объекта garage: " + garage.getType());
         */

        /*Person person = new Person();

        Демонстрируем доступ к полям через геттеры и напрямую (где возможно)
        System.out.println("\nФактические значения через геттеры:");
        System.out.println("getName(): " + person.getName());   // Через геттер
        System.out.println("getAge(): " + person.getAge());     // Через геттер
        System.out.println("getGender(): " + person.getGender()); // Через геттер (обязательно)

        System.out.println("\nПрямой доступ к полям (где возможно):");
        System.out.println("person.name: " + person.name);      // Прямой доступ (public)
        System.out.println("person.age: " + person.age);      // Прямой доступ (default, в том же пакете)
        System.out.println("person.gender: " + person.gender); // Ошибка компиляции! Приватное поле
         */

        /*Patient patient = new Patient();
        patient.setTreatmentPlan(1); // План лечения: 1 = хирург

        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient);

        System.out.println("Назначенный врач: " + patient.getDoctor().getClass().getSimpleName());*/


        /*Apple apple = new Apple("зелёный");
        System.out.println("Изначальный цвет: " + apple.getColor());

        try {
            // Получаем объект Field для приватного поля "color"
            Field colorField = Apple.class.getDeclaredField("color");

            // Делаем поле доступным (приватное --> доступно для изменения)
            colorField.setAccessible(true);

            // Изменяем значение поля color на "красный"
            colorField.set(apple, "красный");

            System.out.println("Изменённый цвет: " + apple.getColor());

        } catch (NoSuchFieldException | IllegalAccessException e)  {

            // Обработка исключений
            System.out.println("Ошибка при доступе к полю: " + e.getMessage());
        }
         */

       /* // Создаём объекты животных
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        // Тестируем голоса
        System.out.println("=== Voices ===");
        dog.voice();
        tiger.voice();
        rabbit.voice();

        // Тестируем еду
        System.out.println("\n=== Eating ===");

        // Dog
        dog.eat("Meat");      // Положительно
        dog.eat("Grass");     // Отрицательно
        dog.eat("Fish");      // Отрицательно

        // Tiger
        tiger.eat("Meat");    // Положительно
        tiger.eat("Grass");   // Отрицательно

        // Rabbit
        rabbit.eat("Grass");  // Положительно
        rabbit.eat("Meat");   // Отрицательно
        rabbit.eat("Carrot"); // Отрицательно

        */

        /*Dog1 dog = Dog1.createDog ("Ричи");  // Создание через статический метод
        dog.voice();
        dog.eat();
         */

        /*try {
            // Получаем класс Dog
            Class<?> dogClass = Class.forName("Dog1");

            // Получаем приватный конструктор
            Constructor<?> constructor = dogClass.getDeclaredConstructor(String.class);

            // Делаем конструктор доступным (обход private)
            constructor.setAccessible(true);

            // Создаём объект через рефлексию
            Dog1 dog = (Dog1) constructor.newInstance("Тэри");

            // Вызываем методы
            dog.voice();
            dog.eat();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            System.out.println("Ошибка: " + e.getMessage());

         */

        /*UserSystem user1 = new UserSystem("nataliebrago", "qabrago@gmail.com", 30);
        UserSystem user2 = new UserSystem("nataliebrago", "qabrago@gmail.com", 30);
        UserSystem user3 = new UserSystem("qabrago", "nataliebrago@gmail.com", 32);

        System.out.println(user1.toString()); // UserSystem{login='nataliebrago', email='qabrago@gmail.com', age=30}
        System.out.println(user2.toString());
        System.out.println("user1.equals(user2)? " + user1.equals(user2)); // true
        System.out.println("user1.equals(user3)? " + user1.equals(user3)); // false
         */

        /*MinMaxString minMaxString = new MinMaxString();
        minMaxString.findMinMaxString();*/

        //StringOrderByLength stringOrderByLength = new StringOrderByLength();
        //stringOrderByLength.sortStringLength();
        //UnderAverageLengthDisplay underAverageLengthDisplay = new UnderAverageLengthDisplay();
        //underAverageLengthDisplay.underAverageLength();
        //UniqueWord uniqueWord = new UniqueWord();
        //uniqueWord.uniqueWordMethod();
        //DoubleLetters doubleLetters = new DoubleLetters();
        //doubleLetters.doubleLettersMethod();
        //PalindromeTester palindromeTester = new PalindromeTester();
        //palindromeTester.palindromeTesterMethod();
        //AbbreviationFinder abbreviationFinder = new AbbreviationFinder();
        //abbreviationFinder.abbreviationFinderMethod();
        //InfoExtractor infoExtractor = new InfoExtractor();
        //infoExtractor.infoExtractorMethod();
        //HandlingExceptions handlingExceptions = new HandlingExceptions();
        //handlingExceptions.arrayIndexOutOfBoundsExceptionMethod();
        //handlingExceptions.arithmeticExceptionMethod();
        //handlingExceptions.exceptionMethods();
        /* Попытка создать объект Person с возрастом менее 18 лет

        try {
            Person underagePerson = new Person(16, "Иван");
            System.out.println("Объект создан: " + underagePerson);
        } catch (AgeValidationException e) {
            System.out.println("Исключение при создании объекта: " + e.getMessage());
        }

        // Попытка создать объект Person с возрастом 18 лет и более
        try {
            Person adultPerson = new Person(25, "Даша");
            System.out.println("Объект создан: " + adultPerson);
        } catch (AgeValidationException e) {
            System.out.println("Исключение при создании объекта: " + e.getMessage());
        }
    */
       /* try {
            boolean isValid = UserCriteria.userCriteriaMethod("nataliebrago ", "Password0", "Password0");
            System.out.println("Валидация успешна: " + isValid);  // true
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }
        */

        //NotFinallyMethod notFinallyMethod = new NotFinallyMethod();
        //notFinallyMethod.notFinallyMethod();

        /*String inputFile = "src/main/resources/romeo-and-juliet.txt";  // Путь к входному файлу
        String outputFile = "longest_word.txt";// Путь к выходному файл

        LongestWordFinder longestWordFinder = new LongestWordFinder();
        String longestWord = longestWordFinder.findLongestWord(inputFile);
        if (longestWord != null && !longestWord.isEmpty()) {
            longestWordFinder.writeToFile(outputFile, longestWord);
            System.out.println("Самое длинное слово: " + longestWord + " (записано в " + outputFile + ")");
        } else {
            System.out.println("Файл не найден, пустой или не содержит слов.");
        }
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к входному файлу (TXT): ");
        String inputPath = scanner.nextLine().trim();

        // Проверяем, существует ли файл
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) {
            System.err.println("Ошибка: Файл не найден по пути " + inputPath);
            return;
        }

        // Пути к выходным файлам (в текущей директории)
        String validPath = "valid_report.txt";
        String invalidPath = "invalid_report.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validPath));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidPath))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Убираем лишние пробелы
                if (line.isEmpty()) {
                    // Пропускаем пустые строки
                    lineNumber++;
                    continue;
                }

                // Проверка валидности
                String reason = DocumentValidator.validateDocumentNumber(line);
                if (reason == null) {
                    // Валидный: записываем в valid_report.txt
                    validWriter.write(line);
                    validWriter.newLine();
                    System.out.println("Строка " + lineNumber + ": Валидный номер - " + line);
                } else {
                    // Невалидный: записываем с причиной в invalid_report.txt
                    invalidWriter.write(line + " - " + reason);
                    invalidWriter.newLine();
                    System.out.println("Строка " + lineNumber + ": Невалидный номер - " + line + " (" + reason + ")");
                }
                lineNumber++;
            }

            System.out.println("\nОбработка завершена!");
            System.out.println("Валидные номера сохранены в: " + validPath);
            System.out.println("Невалидные номера сохранены в: " + invalidPath);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файлов: " + e.getMessage());
        }
        scanner.close();
         */

        //RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        //removeDuplicates.removeDuplicatesMethod();

        /*AnimalCollection collection = new AnimalCollection();

        //Добавляем животных (в начало)
        collection.addAnimal("Кот1");
        collection.addAnimal("Кот2");
        collection.addAnimal("Кот3");

        // Показываем коллекцию
        System.out.println("Текущая коллекция: " + collection.getAnimals());

        // Удаляем из конца
        collection.removeAnimal();
        collection.removeAnimal();

        // Показываем после удалений
        System.out.println("После удалений: " + collection.getAnimals());

        // Попытка удалить из пустой коллекции
        collection.removeAnimal();
    }
         */

        /*// Создаём коллекцию студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алина Ковалева", "Группа ФМК", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Михаил Король", "Группа ФНЯ", 2, Arrays.asList(4, 3, 4))); // Средний <3
        students.add(new Student("Наталья Медведева", "Группа ФАЯ", 1, Arrays.asList(5, 4, 4)));
        students.add(new Student("Дарья Орлянская", "Группа ФМК", 3, Arrays.asList(3, 3, 4))); // Средний =2.66 <3

        System.out.println("До удаления:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Удаление студентов со средним баллом < 3
        removeStudentsWithLowAverage(students);

        System.out.println("\nПосле обработки (удалены с ср.баллом <3, остальные переведены на следующий курс):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Повышение курса студентам со средним >= 3
        promoteStudents(students);

        // Печатаем студентов по курсам
        printStudents(students, 2); // Курс 2
        printStudents(students, 3); // Курс 3
        printStudents(students, 4); // Курс 4
        printStudents(students, 5); // Курс 5
    }
         */
        //MyArrayList<String> list = new MyArrayList<>();

       /* // Добавление
        list.add("Кот Сеня");
        list.add("Кот Васька");
        list.add("Попугай Кеша");
        System.out.println("Размер: " + list.size()); // 3
        System.out.println("Элемент 1: " + list.get(1)); //

        // Проверка
        System.out.println("Есть 'Кот'? " + list.contains("Кот Сеня")); // true

        // Удаление
        list.remove(1);
        System.out.println("После удаления: " + list.get(1)); // Попугай Кеша

        // Очистка
        list.clear();
        System.out.println("Размер после очистки: " + list.size()); // 0
        */

        /*System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));

        System.out.println(pairs(new String[]{"code", "bug"})); // {"b": "g", "c": "e"}
        System.out.println(pairs(new String[]{"man", "moon", "main"})); // {"m": "n"}
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"})); // {"g": "d", "m": "n", "n": "t"}
    }
         */

       /* System.out.println(isBalanced(")(")); // true
        System.out.println(isBalanced("[()]")); // true
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("([{{[(())]}}])")); // true
        System.out.println(isBalanced("{{[]()}}}}")); // false (лишние })
        System.out.println(isBalanced("{[(])}")); // false (пересечение)
        */

        //DayOfWeekFinder.dayOfWeekFinderMethod();
        //NextTuesday.nextTuesdayMethod();
        //HundredthBirthday.hundredthBirthdayMeth();
        //PositiveNumberFinder.positiveNumberFinderMeth();
        //CurrencyConverterFunction.currencyConverterMeth();
        //CurrencyConverterConsumer.currencyConverterConsumerMeth();

        // Получаем Supplier из метода
        Supplier<String> supplier = getReversedStringSupplier();
        // Вызываем get() для получения результата
        String reversed = supplier.get();
        // Выводим результат
        System.out.println("Строка задом наперед: " + reversed);
    }
}