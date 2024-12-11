package menus;

import java.util.Arrays;

public enum WesternMenu {
    RAJANYA("라자냐"),
    GRATANG("그라탱"),
    NYOKI("뇨끼"),
    KKISSU("끼슈"),
    FRENCHTOAST("프렌치토스트"),
    BAGETTE("바게트"),
    SPAGETTI("스파게티"),
    PIZZA("피자"),
    PANINI("파니니");

    private String menuName;

    WesternMenu(String menuName) {
        this.menuName = menuName;
    }

    public static boolean hasMenu(String inputMenu){
        return Arrays.stream(WesternMenu.values()).anyMatch(menu -> menu.menuName.equals(inputMenu));
    }

    public String getMenuName() {
        return menuName;
    }
}

