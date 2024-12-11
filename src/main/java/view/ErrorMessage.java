package view;

public enum ErrorMessage {
    INVALID_COACH_NAME("코치의 이름은 2글자 이상 4글자 이하여야 합니다."),
    INVALID_NUMBER_OF_COACH("코치는 최소 2명 최대 5명입니다."),
    INVALID_NUMBER_OF_CANT_EAT_FOOD("못먹는 음식은 0개 이상 2개 이하여야 합니다."),
    INVALID_NAME_OF_CANT_EAT_MENU("못 먹는 메뉴가 추천할 수 있는 메뉴에 존재하지 않습니다."),
    DUPLICATE_NAME_IS_EXIST("중복된 이름이 입력되었습니다");

    public static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";
    private final String content;

    ErrorMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return ERROR_MESSAGE_PREFIX + content;
    }

}
