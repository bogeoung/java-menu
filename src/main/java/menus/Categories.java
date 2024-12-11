package menus;

public enum Categories {
    ASIAN("아시안"),
    CHINA("중식"),
    JAPAN("일식"),
    KOREAN("한식"),
    WESTERN("양식");

    private final String category;

    Categories(String category) {
        this.category = category;
    }
}
