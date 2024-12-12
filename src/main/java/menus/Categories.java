package menus;

import java.util.ArrayList;
import java.util.List;

public class Categories {
    private static List<String> categories = new ArrayList<>(List.of("일식", "한식", "중식", "아시안", "중식"));

    public static List<String> getCategories() {
        return categories;
    }
}
