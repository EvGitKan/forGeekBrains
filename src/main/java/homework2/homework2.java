package homework2;

public class homework2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5,11));         //task 1
        printPositiveInt(10);                         //task 2
        System.out.println(printPlusOrMinus(-17));  //task 3
        printNumberRows("Hello", 3);            //task 4
        System.out.println(printLeapYear(2022));            //task 5
    }

    private static boolean checkSum(int a, int b) {
        int sum = a + b;
        return (10 <= sum) && (sum <= 20);
    }

    private static void printPositiveInt(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else System.out.println("отрицательное");
    }

    private static boolean printPlusOrMinus(int varA) {
        return varA < 0;
    }

    private static void printNumberRows(String strtext, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(strtext);
        }
    }

    private static boolean printLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
