package lesson5;

import java.util.Scanner;

public class HomeworkLesson5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        int number;
        do {
            System.out.println("Введите номер члена последовательности Фибоначчи:");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
            int m = fibonacci(number);
            System.out.println(number + "-й член последовательности Фибоначчи равен: " + m);
    }

    public static int fibonacci(int number) {
        int a = 0;
        int b = 1;
        int f = 0;

        if (number == 0) {
            return a;
        } else {
            if (number == 1) {
                return b;
            } else {
                for (int i = 2; i <= number; i++) {
                    f = a + b;
                    a = b;
                    b = f;
                }
                return f;
            }
        }
    }
}
