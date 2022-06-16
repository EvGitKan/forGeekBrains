package homework10.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox1.addFruit(new Apple());
            orangeBox1.addFruit(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox2.addFruit(new Apple());
        }
        System.out.println("Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: " + appleBox1.compare(orangeBox1));

        System.out.println("\nПересыпаем из второй коробки в первую...\n");
        appleBox2.pourOverTo(appleBox1);
        System.out.println("Масса первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения 1й коробки с яблоками и коробки с апельсинами: " + appleBox1.compare(orangeBox1));
    }

    static void swap(Object[] arr, int num1, int num2) {
        Object buf = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = buf;
    }

    static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
