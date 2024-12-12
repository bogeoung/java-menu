package menus;

public class AllMenus {

    private AsianMenu asianMenu;
    private ChinaMenu chinaMenu;
    private JapanMenu japanMenu;
    private KoreanMenu koreanMenu;
    private WesternMenu westernMenu;

    public AllMenus() {
        this.asianMenu = new AsianMenu();
        this.chinaMenu = new ChinaMenu();
        this.japanMenu = new JapanMenu();
        this.koreanMenu = new KoreanMenu();
        this.westernMenu = new WesternMenu();
    }

    public boolean checkInMenu(String menuName) {
        return checkAsian(menuName) || checkChina(menuName) || checkJapan(menuName)
                || checkKorea(menuName) || checkWestern(menuName);
    }

    private boolean checkAsian(String menuName) {
        return asianMenu.hasMenu(menuName);
    }

    private boolean checkChina(String menuName) {
        return chinaMenu.hasMenu(menuName);
    }

    private boolean checkJapan(String menuName) {
        return japanMenu.hasMenu(menuName);
    }

    private boolean checkKorea(String menuName) {
        return koreanMenu.hasMenu(menuName);
    }

    private boolean checkWestern(String menuName) {
        return westernMenu.hasMenu(menuName);
    }

}
