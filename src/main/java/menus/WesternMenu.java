package menus;

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

    private String menu;

    WesternMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}

