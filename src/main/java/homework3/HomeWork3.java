package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        replaceIntArray();
//        fillEmptyArray();
//        multiplyLessSixByTwo();
//        setSquareTwoDimensionalArray();
//        setOneDimensionalArray(5, 7);
//        findMaxMinElemArray(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
//        System.out.println(returnTrueIfSumLeftRightEqual(setRandomArray()));
//        shiftArrayElements(new int[] {1, 5, 3, 2, 11, 4, 5}, -2);
    }

    private static void replaceIntArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    private static void fillEmptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void multiplyLessSixByTwo() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void setSquareTwoDimensionalArray() {
        int[][] table= new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                if (i + j == table[i].length - 1) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void setOneDimensionalArray(int len, int initialValue) {
        int[] arrInit = new int[len];
        Arrays.fill(arrInit, initialValue);
        System.out.println(Arrays.toString(arrInit));
    }

    private static void findMaxMinElemArray(int [] arrRand) {
        Arrays.sort(arrRand);
        int max = arrRand[arrRand.length - 1];
        System.out.printf("Максимальный элемент массива: %d %nМинимальный элемент массива: %d", max, arrRand[0]);
    }

    //Использовал рандом массив, чтобы не задавать вручную и самому опробовать его работу:
    private static boolean returnTrueIfSumLeftRightEqual(int[] data) {
        int leftSum = 0;
        for(int i = 0; i < data.length; i++){
            leftSum += data[i];
            int rightSum = 0;
            for (int j = 0; j < data.length; j++){
                rightSum += (j > i)? data[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static int[] setRandomArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число элементов массива: ");
        int num = sc.nextInt();
        sc.close();
        Random random = new Random();
        int[] data = new int[num];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(3);
        }
        System.out.println("Случайно сформированный массив: " + Arrays.toString(data));
        return data;
    }

    private static void shiftArrayElements(int[] array, int n) {
        int shiftNum = n % array.length;
        if (shiftNum < 0) {
            shiftLeft(array, shiftNum);
        } else {
            shiftRight(array, shiftNum);
        }
        System.out.println(Arrays.toString(array) + "; shiftNum = " + n);
    }

    private static void shiftRight( int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastvalue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastvalue;
        }
    }

    private static void shiftLeft( int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstvalue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstvalue;
        }
    }
}
