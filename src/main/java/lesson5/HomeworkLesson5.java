package lesson5;

import java.util.Scanner;

public class HomeworkLesson5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите номер члена последовательности Фибоначчи:");
        while (!scanner.hasNextInt()) {
            System.out.println("Необходимо ввести целое число. Пожалуйста введите число: ");
            scanner.next();
        }
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число. Перезагрузите программу и введите положительное число");
        } else {
            int m = fibonacci(n);
            System.out.println(n + "-й член последовательности Фибоначчи равен: " + m);
        }
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
