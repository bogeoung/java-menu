package menus;

public class AllMenus {

    private static AsianMenu asianMenu;
    private static ChinaMenu chinaMenu;
    private static JapanMenu japanMenu;
    private static KoreanMenu koreanMenu;
    private static WesternMenu westernMenu;

    public static boolean checkInMenu(String menuName) {
        return checkAsian(menuName) || checkChina(menuName) || checkJapan(menuName)
                || checkKorea(menuName) || checkWestern(menuName);
    }

    private static boolean checkAsian(String menuName) {
        return asianMenu.hasMenu(menuName);
    }

    private static boolean checkChina(String menuName) {
        return chinaMenu.hasMenu(menuName);
    }

    private static boolean checkJapan(String menuName) {
        return japanMenu.hasMenu(menuName);
    }

    private static boolean checkKorea(String menuName) {
        return koreanMenu.hasMenu(menuName);
    }

    private static boolean checkWestern(String menuName) {
        return westernMenu.hasMenu(menuName);
    }

}
