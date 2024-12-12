package menus;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JapanMenu implements Menu {
    private final static List<String> menus = new LinkedList<>(List.of("규동","우동","미소시루","스시","가츠동","오니기리","하이라이스",
            "라멘","오코노미야끼"));

    private String menuName;

    @Override
    public boolean hasMenu(String inputMenu) {
        return menus.contains(inputMenu);
    }

    @Override
    public String getMenuName(int index) {
        return menus.get(index);
    }
}

