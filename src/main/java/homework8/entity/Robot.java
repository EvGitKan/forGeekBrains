package homework8.entity;

import homework8.Action;

public class Robot implements Action {

    private final int maxLength;
    private final int maxHeight;
    private String name;
    boolean isActive;

    public Robot(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("%s%s пробежал дистанцию %d метров\n", name, maxLength < length ? " не" : "", length);
        }
        if (maxLength < length)isActive = false;
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("%s%s перепрыгнул препятствие высотой %d метров\n", name, maxHeight < height ? " не" : "", height);
        }
        if (maxHeight < height)isActive = false;
    }
}
