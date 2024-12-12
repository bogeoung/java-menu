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
    List<String> categories;

    public RecommendationMachine() {
        categories = AllMenus.getCategoriesNames();
    }

    public List<Integer> getRandomCategories() {
        List<Integer> weekCategories = new LinkedList<>();
        while (weekCategories.size() < WEEKDAY_COUNT_PER_WEEK) {
            int randomNumber = getRandomNumbers() - INDEX_MATCHER;
            if (weekCategories.stream().filter(s -> s.equals(randomNumber)).count() < MAXIMUM_SAME_CATEGORY_PER_WEEK) {
                weekCategories.add(randomNumber);
            }
        }
        return weekCategories;
    }

    public void setRandomFoodsByCoach(List<Integer> categories, Coaches coaches) {
        for (Coach coach : coaches.getCoaches()) {
            setRandomFoodsByCategory(categories, coach);
        }
    }

    private void setRandomFoodsByCategory(List<Integer> weekCategoriesIndex, Coach coach) {
        for (Integer categoryIndex : weekCategoriesIndex) {
            coach.addWeekFood(pickRandomFoodInCategories(categoryIndex, coach));
        }
    }

    private String pickRandomFoodInCategories(int weekCategoriesIndex, Coach coach) {
        Menu menu = AllMenus.getCategoryByIndex(weekCategoriesIndex);
        while (true) {
            String pickedMenu = menu.getMenuName(getRandomNumbers());
            if (!coach.getCantEatFood().contains(pickedMenu) && !coach.getWeekFood().contains(pickedMenu)) {
                return pickedMenu;
            }
        }
    }

    private int getRandomNumbers() {
        return Randoms.pickNumberInRange(1, 5);
    }
}
