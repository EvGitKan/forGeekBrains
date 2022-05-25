package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мартин Лютер Кот", 30);
        cats[1] = new Cat("Том", 25);
        cats[2] = new Cat("Гарфилд", 50);
        cats[3] = new Cat("Снежок", 10);
        Plate plate = new Plate(100);


//        По моей логике все коты по очереди кушают из миски (по одной порции), в процессе кто-то насыщается и перестает есть. Как только корм в миске заканчивается, система предлагает добавить ещё корма. Если добавляем корм, то оставшиеся голодные коты доедают корм и как только все коты наелись, цикл останавливается и выходит итоговое сообщение. Если корм не добавляем, то также выходит итоговое сообщение.
        outer:
        while (plate.getFoodCount() > 0) {
            for (Cat cat : cats) {
                if (cat.isHungry() == false) {
                    cat.eat(plate);
                    System.out.printf("%s скушал %d единиц(ы) корма. ", cat.getName(), cat.getRandom());
                    plate.printInfo();
                    cat.incFill();
                    cat.checkHungry();
                    plate.addFood();
                    Thread.sleep(70);
                } else continue;
                if (Cat.getCountFull() == cats.length || plate.getFoodCount() == 0) {
                    break outer;
                }
            }
        }

        System.out.println("--------------------------------------------------------\n                         ИТОГИ                          \n--------------------------------------------------------");
        for (Cat cat : cats) {
            System.out.println(cat.isHungry() ? cat.getName() + " сыт и доволен" : cat.getName() + " голоден и грустит");
        }
        System.out.printf("В миске осталось %s единиц корма", plate.getFoodCount());
    }
}