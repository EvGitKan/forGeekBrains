package homework10.task1;

import java.util.Arrays;

//1. �������� �����, ������� ������ ��� �������� ������� ������� (������ ����� ���� ������ ���������� ����);

// ����� ��� ���������:
public class Main {
    public static void main(String[] args) {
        swapObj(new Object[]{"a", "b", "c", "d", "e"}, 2, 4);
    }

    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
        System.out.println(Arrays.toString(array));
    }
}
