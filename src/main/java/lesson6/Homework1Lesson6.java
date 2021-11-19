package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1Lesson6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Введите длину массива (целое положительное число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы не ввели число. Пожалуйста введите целое положительное число:");
                scanner.next();
            }
            length = scanner.nextInt();
        } while (length <= 0);

        double[] array = new double[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }
            System.out.println(Arrays.toString(array));
            double minimal = minimum(array);
            double maximal = maximum(array);
            double mean = arithmetical(array);
            System.out.println("Минимальное значение в массиве равно: " + minimal);
            System.out.println("Максимальное значение в массиве равно: " + maximal);
            System.out.println("Среднее арифметическое значение в массиве равно: " + mean);
            /* Еще один вариант нахождения минимального и максимального значения - через сортировку массива
            Arrays.sort(array);
            System.out.println("Минимальное значение в массиве равно: " + array[0]);
            System.out.println("Максимальное значение в массиве равно: " + array[n-1]); */
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
