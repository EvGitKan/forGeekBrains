package homework7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    private int fill;
    private static int random;
    private static int countFull = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
        this.fill = 0;
    }

    public static void eat(Plate plate) {
        random = ThreadLocalRandom.current().nextInt(4) + 3;
        plate.decreaseFood(random);
    }

    public String getName() {
        return name;
    }
    public int getFill() {
        return fill;
    }

    public static int getRandom() {
        return random;
    }

    public boolean isHungry() {
        return hungry;
    }

    public static int getCountFull() {
        return countFull;
    }

    public void incFill(){
        fill += random;
    }

    public void checkHungry() {
        if (appetite <= fill) {
            hungry = true;
            System.out.printf("-------%s набил свое пузо, больше не хочет кушать.-------\n", name);
            countFull++;
        }
    }
}
