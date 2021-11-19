package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1Lesson6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы не ввели число. Пожалуйста введите целое положительное число:");
            scanner.next();
        }
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число. Перезапустите программу и введите положительное число.");
        } else {
            double[] array = new double[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }
            System.out.println(Arrays.toString(array));
            double minimal = minimum(array);
            System.out.println("Минимальное значение в массиве равно: " + minimal);
            double maximal = maximum(array);
            System.out.println("Максимальное значение в массиве равно: " + maximal);
            /* Еще один вариант нахождения минимального и максимального значения - через сортировку массива
            Arrays.sort(array);
            System.out.println("Минимальное значение в массиве равно: " + array[0]);
            System.out.println("Максимальное значение в массиве равно: " + array[n-1]); */
            double mean = arithmetical(array);
            System.out.println("Среднее арифметическое значение в массиве равно: " + mean);

        }
    }

    public static double minimum(double[] array) {
        double min = array[0];
        for (double v : array) {
            min = Math.min(v, min);
        }
        return min;
    }

    public static double maximum(double[] array) {
        double max = array[0];
        for (double v : array) {
            max = Math.max(v, max);
        }
        return max;
    }

    public static double arithmetical(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum = sum + v;
        }
        return sum / array.length;
    }
}
