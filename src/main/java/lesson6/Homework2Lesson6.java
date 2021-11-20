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
        int a = 0;
        int b = 1;
        defArray[0] = a;
        defArray[1] = b;
        for (int i = 2; i < defArray.length; i++) {
            defArray[i] = a + b;
            a = b;
            b = defArray[i];
        }

        if (number > defArray.length - 1) {
            int[] newArray = Arrays.copyOf(defArray, number + 1);
            int c = defArray[defArray.length - 2];
            int d = defArray[defArray.length - 1];
            for (int i = defArray.length - 1; i < newArray.length; i++) {
                newArray[i] = c + d;
                c = d;
                d = newArray[i];
            }
            System.out.println(number + "-й член последовательности Фибоначчи равен: " + newArray[number]);
        } else {
            System.out.println(number + "-й член последовательности Фибоначчи равен: " + defArray[number]);
        }
    }
}
