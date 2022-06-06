package homework8.entity;

import homework8.Action;
import homework8.Crossable;

public class RunTrack implements Crossable {

    private final int length;

    public RunTrack(int length) {
        this.length = length;
    }

    @Override
    public void cross(Action athlete) {
        athlete.run(length);
    }
}
