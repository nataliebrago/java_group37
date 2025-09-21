package homework12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoExtractor {

    /**
     * Программа на вход получает произвольный текст. В этом тексте может быть номер
     * документа(один или несколько), емейл и номер телефона. Номер документа в
     * формате: xxxx-xxxx-xx, где x- это любая цифра; номер телефона в формате:
     * +(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
     * содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
     * в консоль в формате:
     * email: teachmeskills@gmail.com
     * document number: 1423-1512-51
     * и т.д
     */

    public void infoExtractorMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольный текст:");
        String text = scanner.nextLine();

        // Регулярные выражения
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String documentRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}\\b";

        // Ищем email
        Matcher emailMatcher = Pattern.compile(emailRegex).matcher(text);
        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        // Ищем номер документа
        Set<String> allMatches = new HashSet<>();
        Matcher docMatcher = Pattern.compile(documentRegex).matcher(text);
        while (docMatcher.find()) {
            allMatches.add(docMatcher.group());
        }

        if (!allMatches.isEmpty()) {
            System.out.println("document number(s): ");
            for (String allMatch : allMatches) {
                System.out.println(allMatch + " ");
            }
        }

        // Ищем номер телефона
        Matcher phoneMatcher = Pattern.compile(phoneRegex).matcher(text);
        if (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }
    }
}
