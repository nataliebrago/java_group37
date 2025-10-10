package homework16;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Approach {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new LinkedHashMap<>();
        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                String first = String.valueOf(str.charAt(0));
                String last = String.valueOf(str.charAt(str.length() - 1));
                result.put(first, last);
            }
        }
        return result;
    }
}
