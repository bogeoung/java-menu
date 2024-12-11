package menus;

public enum JapanMenu {
    GYEDONG("규동"),
    WOODONG("우동"),
    MISOSIRU("미소시루"),
    SUSI("스시"),
    KATSUDONG("가츠동"),
    ONIGIRI("오니기리"),
    HIRICE("하이라이스"),
    RAMEN("라멘"),
    OCONOMIYAKI("오코노미야끼");

    private String menu;

    JapanMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}

