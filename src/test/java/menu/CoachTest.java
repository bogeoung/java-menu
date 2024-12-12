package menu;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoachTest {

    private static Coach coach;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        coach = new Coach("포비", List.of("뇨끼"));
    }

    @Test
    @DisplayName("추첨된 음식을 weekFood 변수에 저장한다.")
    void addWeekFoodTest() {
        String testFood = "뇨끼";
        coach.addWeekFood(testFood);
        Assertions.assertThat(coach.getWeekFood().contains(testFood)).isTrue();
    }

}