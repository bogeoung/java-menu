package menus;

import java.util.Arrays;

public enum ChinaMenu {
    KKANPONGGI("깐풍기"),
    FRIEDRICE("볶음면"),
    DONGPAYOOK("동파육"),
    JJAJANG("짜장면"),
    JJAMPONG("짬뽕"),
    MAFADUFU("마파두부"),
    TANGSUYUK("탕수육"),
    TOMATOEGGFRY("토마토달걀볶음"),
    GOCHUJAPCHE("고추잡채");

    private String menuName;

    ChinaMenu(String menuName) {
        this.menuName = menuName;
    }

    public static boolean hasMenu(String inputMenu){
        return Arrays.stream(ChinaMenu.values()).anyMatch(menu -> menu.menuName.equals(inputMenu));
    }
    public String getMenuName() {
        return menuName;
    }
}

