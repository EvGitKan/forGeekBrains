package homework8;

import homework8.entity.*;

public class Main {

    public static void main(String[] args) {
        Action[] athletes = {
                new Human("Билл",700, 150),
                new Cat("Снежок",100, 200),
                new Robot("R2D2", 500, 0),
                new Cat("Том",120, 210),
                new Human("Гарри",1500, 120)
        };

        Crossable[] equipments = {
                new Barrier(50),
                new RunTrack(500),
                new Barrier(70)
        };

        for (Action athlete : athletes) {
            for (Crossable equipment: equipments) {
                equipment.cross(athlete);
            }
        }
    }
}
