package menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menus.AsianMenu;
import menus.ChinaMenu;
import menus.JapanMenu;
import menus.KoreanMenu;
import menus.WesternMenu;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecommendationMachineTest {

    RecommendationMachine recommendationMachine = new RecommendationMachine();

    @BeforeEach
    void setUp() {
        recommendationMachine = new RecommendationMachine();
    }

    @Test
    @DisplayName("카테고리를 무작위로 5개를 선정한다.")
    void getRandomCategoriesTest() {
        List<Integer> weekCategoriesTest = recommendationMachine.getRandomCategories();
        Assertions.assertThat(weekCategoriesTest.size() == RecommendationMachine.WEEKDAY_COUNT_PER_WEEK).isTrue();
    }

    @Test
    @DisplayName("카테고리에 맞는 음식 중 못먹는 음식을 제외한 음식 중에 랜덤한 값을 반환한다..")
    void setRandomFoodsByCoach() {
        List<Integer> categoryIndex = List.of(1, 2, 3, 4, 5);
        Coaches coaches = new Coaches();
        List<String> cantEatFood = List.of("규동, 김밥");
        coaches.add("포비", cantEatFood);

        JapanMenu japanMenu = new JapanMenu();
        KoreanMenu koreanMenu = new KoreanMenu();
        ChinaMenu chinaMenu = new ChinaMenu();
        AsianMenu asianMenu = new AsianMenu();
        WesternMenu westernMenu = new WesternMenu();

        Map<Integer, List<String>> menus = Map.of(
                1, japanMenu.getMenuNames(),
                2, koreanMenu.getMenuNames(),
                3, chinaMenu.getMenuNames(),
                4, asianMenu.getMenuNames(),
                5, westernMenu.getMenuNames()
        );

        recommendationMachine.setRandomFoodsByCoach(categoryIndex, coaches);

        Coach curCoach = coaches.getCoaches().get(0);
        for (int i = 0; i < curCoach.getWeekFood().size(); i++) {
            Assertions.assertThat(menus.get(i+1).contains(curCoach.getWeekFood().get(i)))
                    .as("%d번째 음식은 %s번째 국가의 메뉴여야 합니다.", i, i);
        }

        Assertions.assertThat(curCoach.getWeekFood().contains(cantEatFood)).isFalse().as(
                "못먹는 음식은 추천 음식에 포함되면 안됩니다");
    }
}