package menu;

import java.util.LinkedList;
import java.util.List;
import menus.AllMenus;
import camp.nextstep.edu.missionutils.Randoms;
import menus.Menu;

public class RecommendationMachine {

    public static final int WEEKDAY_COUNT_PER_WEEK = 5;
    public static final int MAXIMUM_SAME_CATEGORY_PER_WEEK = 2;
    public static final int INDEX_MATCHER = 1;

    public List<Integer> getRandomCategories() {
        List<Integer> weekCategories = new LinkedList<>();
        while (weekCategories.size() < WEEKDAY_COUNT_PER_WEEK) {
            int randomNumber = getRandomNumbers();
            if (weekCategories.stream().filter(s -> s.equals(randomNumber)).count() < MAXIMUM_SAME_CATEGORY_PER_WEEK) {
                weekCategories.add(randomNumber);
            }
        }
        return weekCategories;
    }

    public void setRandomFoodsByCoach(List<Integer> categoryIndexes, Coaches coaches) {
        for (Integer categoryIndex : categoryIndexes) {
            for (Coach coach : coaches.getCoaches()) {
                coach.addWeekFood(pickRandomFoodInCategories(categoryIndex - INDEX_MATCHER, coach));
            }
        }
    }


    private String pickRandomFoodInCategories(int weekCategoriesIndex, Coach coach) {
        AllMenus allMenus = new AllMenus();
        Menu menu = allMenus.getCategoryByIndex(weekCategoriesIndex);
        while (true) {
            String pickedMenu = Randoms.shuffle(menu.getMenuNames()).get(0);
            if (!coach.getCantEatFood().contains(pickedMenu) && !coach.getWeekFood().contains(pickedMenu)) {
                return pickedMenu;
            }
        }
    }

    private int getRandomNumbers() {
        return Randoms.pickNumberInRange(1, 5);
    }
}
