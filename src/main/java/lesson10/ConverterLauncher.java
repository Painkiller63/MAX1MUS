package lesson10;

import java.util.Scanner;

public class ConverterLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int index;
        do {
            System.out.println("Введите индекс конвертера температуры: ");
            System.out.println("1 - из Цельсия в Фаренгейт");
            System.out.println("2 - из Фаренгейт в Цельсий");
            System.out.println("3 - из Цельсия в Кельвин");
            System.out.println("4 - из Кельвина в Цельсий");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            index = scanner.nextInt();
        } while ((index < 1) || (index > 4));

        Converters.Convertation temperature = new Converters.Convertation();
        temperature.converter(index);
    }

}
