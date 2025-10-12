package classwork17;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class NextTuesday {
    public static void nextTuesdayMethod() {
        // Получаем текущую дату
        LocalDate today = LocalDate.now();

        // Находим следующий вторник
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));

        // Выводим результат
        System.out.println("Дата следующего вторника: " + nextTuesday);
    }
}