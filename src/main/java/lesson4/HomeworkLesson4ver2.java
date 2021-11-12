package lesson4;

import java.util.Scanner;

public class HomeworkLesson4ver2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        boolean b = scanner.hasNextInt();
        if (b) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("Квадратный корень нуля равен 0");
            } else {
                if (n < 0) {
                    System.out.println("Вы ввели отрицательное число! Введите положительное число.");
                } else {
                    int i = 1;
                    while (true) {
                        double m = (double) n / i;
                        if (m == i) {
                            System.out.println("Квадратный корень числа " + n + " равен: " + i);
                            break;
                        } else {
                            if (m > i) {
                                i++;
                            } else {
                                System.out.println("Квадратный корень числа " + n + ": нецелое число.");
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
