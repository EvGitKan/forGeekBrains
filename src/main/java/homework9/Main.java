package homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //объявляем массивы:

        String[][] array0 = new String[][]{
                {"1", "3", "6", "g"},
                {"2", "e", "6"},
                {"3", "4", "5", "9"},
                {"1", "3"}
        };
        String[][] array1 = new String[][]{
                {"1", "1", "6", "7"},
                {"2", "3", "6", "5"},
                {"2", "4", "4", "5"},
                {"6", "3", "7", "1"}
        };
        String[][] array2 = new String[][]{
                {"1"},
                {"1", "2", "e", "6"},
                {"3", "4", "5"},
                {"g", "g", "1", "3"}
        };
        String[][] array3 = new String[][]{
                {"5", "5", "6", "5"},
                {"0", "2"},
                {"1", "1", "1", "9"},
        };



        // определение последовательности для выброса исключений:

        try {
            System.out.println("\nСложение элементов массива array0: ");
            System.out.println("Сумма элементов массива array0 = " + sumElementsArray(array0));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("\nСложение элементов массива array1: ");
            System.out.println("Сумма элементов массива array1 = " + sumElementsArray(array1));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("\nСложение элементов массива array2: ");
            System.out.println("Сумма элементов массива array2 = " + sumElementsArray(array2));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("\nСложение элементов массива array3: ");
            System.out.println("Сумма элементов массива array3 = " + sumElementsArray(array3));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e);
        }

    }


    private static int sumElementsArray(String[][] array) {
        checkSize(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    checkElements(array, i, j);
                }
            }
        }
        return sum;
    }


    //Метод для проверки размерной сетки массива:
    private static void checkSize(String[][] array) throws MySizeArrayException {
        int countElement = 4;
        if (array.length != countElement) {
            throw new MySizeArrayException(String.format("Размерность массива не соответствует заданному %d:%d", countElement, countElement));
        }
    }

    //Метод для обработки исключения при проверке сторонних символов, кроме целых чисел:
    private static void checkElements(String[][] array, int i, int j) throws MyArrayDataException {
        throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целочисленный элемент %s.", i, j, array[i][j]));
    }

}



