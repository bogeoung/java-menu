package View;

public enum Message {
    RECOMMENDATION_START("점심 메뉴 추천을 시작합니다."),
    GET_COACH_NAME("코치의 이름을 입력해주세요. (, 로 구분)"),
    GET_CANT_EAT("[코치이름] (이)가 못 먹는 메뉴를 입력해주세요.");
    private final String content;

    Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
