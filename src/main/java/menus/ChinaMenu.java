package menus;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ChinaMenu implements Menu {

    private final static List<String> menus = new LinkedList<>(List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부",
            "탕수육", "토마토", "달걀볶음", "고추잡채"));

    @Override
    public boolean hasMenu(String inputMenu) {
        return menus.contains(inputMenu);
    }

    @Override
    public String getMenuName(int index) {
        return menus.get(index);
    }
}

