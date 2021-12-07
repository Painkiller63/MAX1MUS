package lesson10;

import java.util.Scanner;

public class ConvertersRunner {

    public static Converter converter;

    public void converter(int index) {
        ConverterType converterType = ConverterType.getConvertType(index);
        switch (converterType) {
            case CELCIUS_TO_FARENHEIT:
                converter = new CelsiusToFahrenheit();
                System.out.println("Температура равна " + converter.convert(choseTemperature()) + " Фаренгейт");
            case FARENHEIT_TO_CELCIUS:
                converter = new FahrenheitToCelsius();
                System.out.println("Температура равна " + converter.convert(choseTemperature()) + " Цельсий");
            case CELCIUS_TO_KELVIN:
                converter = new CelsiusToKelvin();
                System.out.println("Температура равна " + converter.convert(choseTemperature()) + " Кельвин");
            case KELVIN_TO_CELCIUS:
                converter = new KelvinToCelsius();
                System.out.println("Температура равна " + converter.convert(choseTemperature()) + " Цельсий");
        }
    }

    public static float choseTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру для конвертации:");
        while (!scanner.hasNextFloat()) {
            System.out.println("Вы ввели не число. Пожалуйста введите число: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}