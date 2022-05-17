package homework6;

public class Cat extends Animal {

    private static int numAnimals;

    public Cat(String nickname, int runDistanceLimit, int swimDistanceLimit) {
        super(nickname, runDistanceLimit, swimDistanceLimit);
        numAnimals++;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public void swim(int swimDistance) {
        System.out.printf("%s не умеет плавать, увы!\n", getNickname());
    }
}


