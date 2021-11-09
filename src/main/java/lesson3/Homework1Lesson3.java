package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1Lesson3 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите первый коэффициент: ");
            String k1 = reader.readLine();
            System.out.println("Введите второй коэффициент: ");
            String k2 = reader.readLine();
            System.out.println("Введите значение свободного члена: ");
            String s = reader.readLine();

            double a = Double.parseDouble(k1);
            double b = Double.parseDouble(k2);
            double c = Double.parseDouble(s);

            if (a == 0) {
                System.out.println("Первый коэффициент не может 0");
            } else {
                double d = Math.pow(b, 2) - (4 * a * c);

                if (d < 0) {
                    System.out.println("Нет действительных решений уравнения");
                } else {
                    if (d > 0) {

                        double x1 = (-b + Math.sqrt(d)) / (2 * a);
                        double x2 = (-b - Math.sqrt(d)) / (2 * a);

                        System.out.println("Корни уравнения: " + x1 + " " + x2);
                    } else {
                        double x = -b / (2 * a);

                        System.out.println("Корень уравнения: " + x);
                    }
                }

            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Вы ввели текст, а не число");
        }
    }
}