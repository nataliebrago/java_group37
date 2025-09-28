package homework13;

public class UserCriteria {

    public static boolean userCriteriaMethod(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка логина: длина < 20 и без пробелов
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть короче 20 символов и не содержать пробелы");
        }

        // Проверка пароля: длина < 20, без пробелов, содержит цифру, совпадает с подтверждением
        if (password.length() >= 20 || password.contains(" ") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль должен быть короче 20 символов, не содержать пробелы, " +
                    "содержать хотя бы одну цифру и совпадать с подтверждением");
        }

        // Проверка наличия хотя бы одной цифры в пароле
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
        }

        /* Проверка наличия хотя бы одной цифры в пароле с использованием регулярного выражения
        if (!Pattern.compile("\\d").matcher(password).find()) {
            throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
         */

        /*
        if (!password.matches(".*\\d.*")) {
    throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
}
         */

        // Если все проверки пройдены
        return true;
    }
}
