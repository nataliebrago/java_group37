package homework16;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        // Подсчитываем сколько раз каждое слово встречается
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // Для каждого слова определяем, встречается ли оно 2 или более раз
        for (String word : counts.keySet()) {
            result.put(word, counts.get(word) >= 2);
        }

        return result;
    }
}
