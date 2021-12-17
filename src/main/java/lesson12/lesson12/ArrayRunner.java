package lesson12.lesson12;

import lesson12.MyArray;
import lesson12.MyArrayDataException;
import lesson12.MyArraySizeException;

public class ArrayRunner {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        System.out.println(MyArray.buildArray());
    }
}