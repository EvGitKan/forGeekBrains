package homework6;

import java.util.Scanner;

public class Main {

    static int number;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Animal cat = new Cat("Барсик", 200, 0);
        Animal dog = new Dog("Рекс", 500, 10);


        //Если я правильно понял задание 3.* Добавить возможность задавать индивидуальные параметры плавания и бега для животных (т.е. для каждого объекта параметры плавания и бега будут свои), причем важно сохранить невозможность плавания для кота. -- Выше, при создании животных указал ограничения из пункта 2 (бег: кот 200, собака 500; плавание: кот не умеет плавать, собака 10). Четыре сеттера ниже как раз для того, чтобы можно было задать ограничения для каждого животного через консоль.

        System.out.printf("Задайте для кота по имени %s ограничение по бегу: ", cat.getNickname());
        cat.setRunDistanceLimit(checkInteger());
        System.out.printf("Задайте для кота по имени %s ограничение по плаванию: ", cat.getNickname());
        cat.setSwimDistanceLimit(checkInteger());

        System.out.printf("Задайте для собаки по имени %s ограничение по бегу: ", dog.getNickname());
        dog.setRunDistanceLimit(checkInteger());
        System.out.printf("Задайте для собаки по имени %s ограничение по плаванию: ", dog.getNickname());
        dog.setSwimDistanceLimit(checkInteger());



        System.out.printf("Сколько метров должен пробежать %s? - ", cat.getNickname());
        cat.run(checkInteger());

        System.out.printf("Сколько метров должен пробежать %s? - ", dog.getNickname());
        dog.run(checkInteger());

        System.out.printf("Сколько метров должен проплыть %s? - ", cat.getNickname());
        cat.swim(checkInteger());

        System.out.printf("Сколько метров должен проплыть %s? - ", dog.getNickname());
        dog.swim(checkInteger());


        System.out.println("--------------------------------------------------------");
        System.out.printf("Всего создано животных - %d, из них %d кот(ов) и %d собак(а)", Animal.getNumAnimals(),Cat.getNumAnimals(), Dog.getNumAnimals());

    }


    public static int checkInteger() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                return n;
            } else {
                scan.next();
                System.out.println("!!! Введите значение в числовом формате.");
            }
        }
    }
}
