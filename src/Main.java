import java.util.*;
public class Main {
    public static String calc(String input) {
        // Проверяем корректность входных данных
        if (!input.matches("\\d+\\s*[+\\-*/]\\s*\\d+"))
            throw new IllegalArgumentException("Invalid input");

        // Разбиваем строку на числа и операцию
        String[] elements = input.split("\\s+");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        char op = elements[1].charAt(0);

        // Проверяем корректность арифметической операции и выбираем соответствующий алгоритм
        int result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        // Возвращаем результат операции
        return Integer.toString(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}