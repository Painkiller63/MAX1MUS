package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2Lesson3 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите целое положительное число: ");
            int n = Integer.parseInt(reader.readLine());
            if (n < 0) {
                System.out.println("Ошибка! Необходимо ввести целое положительное число!");
            } else {
                if (n == 0) {
                    System.out.println("Факториал " + n + "! равен 1");
                } else {
                    long result = 1;
                    for (int i = 1; i <= n; i++) {
                        result = result * i;
                    }
                    System.out.println("Факториал " + n + "! равен " + result);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка! Введенный символ не является числом!");
        }
    }
}
