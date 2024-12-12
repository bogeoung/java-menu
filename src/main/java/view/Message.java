package view;

public enum Message {
    RECOMMENDATION_START("점심 메뉴 추천을 시작합니다."),
    GET_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    GET_CANT_EAT("%s(이)가 못 먹는 메뉴를 입력해 주세요.%s"),
    RECOMMENDATION_RESULT_START("메뉴 추천 결과입니다."),
    RECOMMENDATION_RESULT_DAY("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    RECOMMENDATION_END("%s추천을 완료했습니다.");

    private final String content;

    Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
