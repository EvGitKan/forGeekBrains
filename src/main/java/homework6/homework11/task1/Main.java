package homework6.homework11.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        arrayWords();
    }

    private static void arrayWords() {
        ArrayList<String> array = new ArrayList<>();
        array.add("Apricot");
        array.add("Avocado");
        array.add("Banana");
        array.add("Melon");
        array.add("Cherry");
        array.add("Kiwi");
        array.add("Orange");
        array.add("Grapefruit");
        array.add("Pear");
        array.add("Lemon");
        array.add("Banana");
        array.add("Apricot");
        array.add("Banana");
        array.add("Cherry");
        array.add("Lemon");

        Map<Object, Long> arrayFruit = array.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(arrayFruit);

    }
}
