package homework14;

public class DocumentValidator {

    // Проверка валидности номера документа

    public static String validateDocumentNumber(String docNumber) {
        if (docNumber == null) {
            return "Номер документа отсутствует";
        }

        if (docNumber.length() != 15) {
            return "Длина документа не равна 15 символам, а равна " + docNumber.length();
        }

        // Проверяем только буквы и цифры
        if (!docNumber.matches("[a-zA-Z0-9]+")) {
            return "Документ содержит недопустимые символы (должны быть только буквы и цифры)";
        }

        // Проверяем префиксы
        if (!(docNumber.startsWith("docnum") || docNumber.startsWith("contract"))) {
            return "Документ не начинается с 'docnum' или 'contract'";
        }

        // Если все условия соблюдены — валидно
        return null;
    }
}
