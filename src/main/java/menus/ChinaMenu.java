package menus;

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

    private String menu;

    ChinaMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}

