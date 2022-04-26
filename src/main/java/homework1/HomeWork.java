package homework1;

public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 5;
        int b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    private static void printColor() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = -20;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
