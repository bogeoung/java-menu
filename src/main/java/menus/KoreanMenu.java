package menus;

import java.util.Arrays;

public enum KoreanMenu {
    KIMBAP("김밥"),
    KIMCHISOUP("김치찌개"),
    SSAMPBAB("쌈밥"),
    SOYBEANSOUP("된장찌개"),
    BIBIMBAP("비빔밥"),
    KALNOODLE("칼국수"),
    BULGOGI("불고기"),
    TTEOKBBOKI("떡볶이"),
    GAEYUK("제육볶음");

    private String menuName;

    KoreanMenu(String menuName) {
        this.menuName = menuName;
    }

    public static boolean hasMenu(String inputMenu){
        return Arrays.stream(KoreanMenu.values()).anyMatch(menu -> menu.menuName.equals(inputMenu));
    }

    public String getMenuName() {
        return menuName;
    }
}

