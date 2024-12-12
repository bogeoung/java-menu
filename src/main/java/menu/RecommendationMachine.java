package menu;

import java.util.LinkedList;
import java.util.List;
import menus.Categories;
import camp.nextstep.edu.missionutils.Randoms;

public class RecommendationMachine {

    public static final int WEEKDAY_COUNT_PER_WEEK = 5;
    public static final int MAXIMUM_SAME_CATEGORY_PER_WEEK = 2;
    public static final int INDEX_MATCHER = 1;
    List<String> categories;

    public RecommendationMachine() {
        this.categories = Categories.getCategories();
    }

    public List<String> getRandomCategories(){
        List<String> weekCategories = new LinkedList<>();
        while(weekCategories.size() < WEEKDAY_COUNT_PER_WEEK){
            int randomNumber = getRandomNumbers() - INDEX_MATCHER;
            String categoryName = categories.get(randomNumber);
            if(weekCategories.stream().filter(s -> s.equals(categoryName)).count() < MAXIMUM_SAME_CATEGORY_PER_WEEK){
                weekCategories.add(categoryName);
            }
        }
        return weekCategories;
    }

    private int getRandomNumbers(){
        return Randoms.pickNumberInRange(1, 5);
    }
}
