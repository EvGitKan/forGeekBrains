package homework8.entity;

import homework8.Action;
import homework8.Crossable;

public class Barrier implements Crossable {

    private final int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void cross(Action athlete) {
        athlete.jump(height);
    }

}
