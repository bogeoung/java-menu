package menu;

import java.util.LinkedList;
import java.util.List;
import menus.AllMenus;
import view.OutputView;

public class Result {
    private final String RESULT_START = "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]";

    public static void print(List<Integer> weekCategories, Coaches coaches){
        OutputView.printResult();
        printCategories(weekCategories);
        for(int i=0; i<coaches.getCoaches().size(); i++){
            printCoachResult(coaches.getCoaches().get(i));
        }
        OutputView.printResultEnd();
    }

    private static void printCategories(List<Integer> weekCategoryindexes){
        List<String> weekCategoryNames = new LinkedList<>();
        for(Integer weekCategoryIndex : weekCategoryindexes){
            weekCategoryNames.add(AllMenus.getCategoryNameByIndex(weekCategoryIndex - 1));
        }
        OutputView.printCategories(weekCategoryNames);
    }

    private static void printCoachResult(Coach coach){
        OutputView.printCoachResult(coach.name,coach.getWeekFood());

    }


}
