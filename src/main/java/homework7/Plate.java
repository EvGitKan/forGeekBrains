package homework7;

import java.util.Scanner;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске осталось - " + foodCount + " единиц корма";
    }

    public void decreaseFood(int catEatFoodCount) {
        while (foodCount < catEatFoodCount); {
            foodCount -= catEatFoodCount;
            if (foodCount < catEatFoodCount) {
                foodCount = 0;
            }
        }
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood() {
        if (getFoodCount() == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Хотите обрадовать котиков и добавить корма в миску? y/n");
            String reply = scan.next();
            switch (reply) {
                case "y", "+", "да", "конечно", "yes" -> foodCount += 100;
                default -> System.out.println("Жадина!");
            };
        }
    }
}
