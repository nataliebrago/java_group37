package homework15;

import java.util.List;

public class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", grades=" + grades + ", average=" + String.format("%.2f", findAverageGrade()) + "}";
    }

    // Метод для вычисления среднего балла
    public double findAverageGrade() {
        if (grades.isEmpty())
            return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Метод для удаления студентов со средним баллом < 3
    public static void removeStudentsWithLowAverage(List<Student> students) {
        students.removeIf(student -> student.findAverageGrade() < 3);
    }

    // Метод для повышения курса студентам со средним >= 3
    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.findAverageGrade()>= 3) {
                student.course += 1; // переводим на следующий курс
            }
        }
    }

    // Метод для печати студентов по курсу
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на этом курсе.");
        }
    }
}
