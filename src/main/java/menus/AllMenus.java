package menus;

import java.util.ArrayList;
import java.util.List;

public class AllMenus {

    private static List<Menu> categories = new ArrayList<>();
    private final static List<String> categoryNames = new ArrayList<>(List.of("일식", "한식", "중식", "아시안", "양식"));

    public AllMenus() {
        categories.add(new JapanMenu());
        categories.add(new KoreanMenu());
        categories.add(new ChinaMenu());
        categories.add(new AsianMenu());
        categories.add(new WesternMenu());
    }

    public boolean checkInMenu(String menuName) {
        for(Menu menu : categories) {
            if(menu.hasMenu(menuName)){
                return true;
            }
        }
        return false;
    }

    public static List<String> getCategoriesNames() {
        return categoryNames;
    }

    public static String getCategoryNameByIndex(int index) {
        return categoryNames.get(index);
    }

    public static Menu getCategoryByIndex(int index) {
        return categories.get(index);
    }
}
