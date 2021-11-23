package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2Lesson6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите номер члена последовательности Фибоначчи (целое положительное число): ");
            while (!(sc.hasNextInt())) {
                System.out.println("Вы ввели не число! Пожалуйста введите целое положительное число:");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        int[] defArray = new int[10];
        fibonacci(defArray);

        if (number > defArray.length - 1) {
            int[] newArray = Arrays.copyOf(defArray, number + 1);
            for (int i = defArray.length; i < newArray.length; i++) {
                fibonacci(newArray);
            }
            System.out.println(number + "-й член последовательности Фибоначчи равен: " + newArray[number]);
        } else {
            System.out.println(number + "-й член последовательности Фибоначчи равен: " + defArray[number]);
        }
    }

    public static void fibonacci(int[] array) {

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    }
}

