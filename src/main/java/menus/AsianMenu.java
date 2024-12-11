package menus;

public enum AsianMenu {
    PATTAI("팟타이"),
    KAOPAT("카오팟"),
    NACHIGORANG("나시고렝"),
    PINEAPPLEFRYRICE("파인애플볶음밥"),
    RICENOODLE("쌀국수"),
    TTOMYANKKONG("똠얌꿍"),
    BANMI("반미"),
    WOLNAMSSAM("월남쌈"),
    BUNCCHA("분짜");

    private String menu;

    AsianMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}

