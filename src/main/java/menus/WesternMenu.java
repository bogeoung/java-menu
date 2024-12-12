package menus;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WesternMenu implements Menu {

    private final static List<String> menus = new LinkedList<>(
            List.of("라자냐,", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));

    @Override
    public boolean hasMenu(String inputMenu) {
        return menus.contains(inputMenu);
    }

    @Override
    public List<String> getMenuNames() {
        return menus;
    }
}

