package homework6;

public abstract class Animal {
    private String nickname;
    private int runDistance;
    private int swimDistance;
    private int runDistanceLimit;
    private int swimDistanceLimit;
    private static int numAnimals;

    public Animal(String nickname, int runDistanceLimit, int swimDistanceLimit) {
        this.nickname = nickname;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
        numAnimals++;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public static void setNumAnimals(int numAnimals) {
        Animal.numAnimals = numAnimals;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public void setRunDistanceLimit(int runDistanceLimit) {
        this.runDistanceLimit = runDistanceLimit;
    }

    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }

    public void setSwimDistanceLimit(int swimDistanceLimit) {
        this.swimDistanceLimit = swimDistanceLimit;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }


    public void run(int runDistance) {
        if (runDistance <= runDistanceLimit) {
            System.out.printf("%s пробежал %s метров.\n", getNickname(), runDistance);
        } else System.out.printf("%s не смог пробежать %s метров, устал.\n", getNickname(), runDistance);
    }

    public void swim(int swimDistance) {
        if (swimDistance <= swimDistanceLimit) {
            System.out.printf("%s проплыл %s метров.\n", getNickname(), swimDistance);
        } else System.out.printf("%s не смог проплыть %s метров, устал.\n", getNickname(), swimDistance);
    }
}
