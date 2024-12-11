package menu;

import java.util.LinkedList;
import java.util.List;

public class Coaches {

    List<Coach> coaches;

    public Coaches() {
        this.coaches = new LinkedList<>();
    }

    public void add(String name, List<String> cantEatFoods) {
        coaches.add(new Coach(name, cantEatFoods));
    }
}
