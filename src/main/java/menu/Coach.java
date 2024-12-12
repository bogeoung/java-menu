package menu;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    String name;
    List<String> cantEatFood;
    List<String> weekFood;

    public Coach(String name, List<String> cantEatFood) {
        this.name = name;
        this.cantEatFood = cantEatFood;
        this.weekFood = new ArrayList<>();
    }

    public void addWeekFood(String name){
        this.weekFood.add(name);
    }

    public List<String> getCantEatFood() {
        return cantEatFood;
    }

    public List<String> getWeekFood() {
        return weekFood;
    }
}
