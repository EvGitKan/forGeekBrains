package homework6;

public class Dog extends Animal {

    private static int numAnimals;

    public Dog(String nickname, int runDistanceLimit, int swimDistanceLimit) {
        super(nickname, runDistanceLimit, swimDistanceLimit);
        numAnimals++;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

}
