package menus;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KoreanMenu implements Menu {
    private final static List<String> menus = new LinkedList<>(List.of("김밥,","김치찌개","쌈밥","된장찌개","비빔밥","칼국수","불고기","떡볶이","제육볶음"));

    @Override
    public boolean hasMenu(String inputMenu) {
        return menus.contains(inputMenu);
    }

    @Override
    public String getMenuName(int index) {
        return menus.get(index);
    }
}

