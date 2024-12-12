package menus;

import java.util.LinkedList;
import java.util.List;

public class AsianMenu implements Menu {

    private final static List<String> menus = new LinkedList<String>(
            List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"));

    @Override
    public boolean hasMenu(String inputMenu) {
        return menus.contains(inputMenu);
    }

    @Override
    public List<String> getMenuNames() {
        return menus;
    }

}

