import java.io.*;

class CustomNumberFormatException extends Exception {
    public CustomNumberFormatException(String message) {
        super(message);
    }
}

public class NumberConverter {
    public static void main(String[] args) {
        String input = "123abc";

        try {
            int number = convertStringToNumber(input);
            System.out.println("Число: " + number);
        } catch (CustomNumberFormatException e) {
            System.out.println(e.getMessage());
            logException(e);
        }
    }

    public static int convertStringToNumber(String str) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Ошибка: Строка '" + str + "' не является числом.");
        }
    }

    public static void logException(Exception e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(e.getMessage());
            writer.newLine();
        } catch (IOException ioException) {
            System.out.println("Ошибка записи в лог-файл: " + ioException.getMessage());
        }
    }
}