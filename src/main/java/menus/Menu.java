package menus;

import java.util.List;

public interface Menu {
    boolean hasMenu(String name);
    List<String> getMenuNames();
}
