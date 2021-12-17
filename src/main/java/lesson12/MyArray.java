package lesson12;

import java.util.Scanner;

public class MyArray {

    public static int buildArray() throws MyArrayDataException, MyArraySizeException {
        Scanner lengthScan = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Введите размеры массива (целое положительное число): ");
            while (!lengthScan.hasNextInt()) {
                System.out.println("Вы не ввели число. Пожалуйста введите целое положительное число:");
                lengthScan.next();
            }
            a = lengthScan.nextInt();
            b = lengthScan.nextInt();
        } while ((a <= 0) || (b <= 0));

        if ((a == 4) && (b == 4)) {
            String[][] myArray = new String[a][b];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    Scanner arrayScan = new Scanner(System.in);
                    System.out.println("Введите значение элемента массива [" + i + "][" + j + "]: ");
                    myArray[i][j] = arrayScan.nextLine();
                }
            }

            int[][] newArray = new int[a][b];
            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j < newArray.length; j++) {
                    try {
                        newArray[i][j] = Integer.parseInt(myArray[i][j]);
                    } catch (Exception e) {
                        throw new MyArrayDataException("Элемент массива [" + i + "][" + j + "] не содержит число!");
                    }
                }
            }
            return sumArray(newArray);
        } else throw new MyArraySizeException("Неверный размер массива! Размер массива должен быть равен 4х4!");
    }

    private static int sumArray(int[][] newArray) {
        int sum = 0;
        for (int[] ints : newArray) {
            for (int j = 0; j < newArray.length; j++) {
                sum = sum + ints[j];
            }
        }
        return sum;
    }
}