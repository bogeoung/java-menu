package view;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void coachNameLengthIsWrong(){
        System.out.println(ErrorMessage.INVALID_COACH_NAME.getContent());
    }

    public static void numberOfCoachIsWrong(){
        System.out.println(ErrorMessage.INVALID_NUMBER_OF_COACH.getContent());
    }

    public static void numberOfCantEatFoodIsWrong(){
        System.out.println(ErrorMessage.INVALID_NUMBER_OF_CANT_EAT_FOOD.getContent());
    }

    public static void cantEatFoodMenuDoesntExist(){
        System.out.println(ErrorMessage.INVALID_NAME_OF_CANT_EAT_MENU.getContent());
    }

    public static void duplicateName() {
        System.out.println(ErrorMessage.DUPLICATE_NAME_IS_EXIST.getContent());
    }

    public static void printResult() {
        System.out.println(Message.RECOMMENDATION_RESULT_START.getContent());
        System.out.println(Message.RECOMMENDATION_RESULT_DAY.getContent());
    }

    public static void printCategories(List<String> weekCategoryNames) {
        final String categoryPrefix = "[ 카테고리 | ";
        final String categorySuffix = " ]";
        System.out.println(categoryPrefix + String.join(" | ", weekCategoryNames) + categorySuffix);
    }

    public static void printCoachResult(String name, List<String> weekFood) {
        final String coachPrefix = "[ ";
        final String coachSuffix = " ]";
        List<String> weekFoodWithName = new ArrayList<>(weekFood);
        weekFoodWithName.add(0, name);
        System.out.println(coachPrefix + String.join(" | ", weekFoodWithName) + coachSuffix);
    }

    public static void printResultEnd() {
        System.out.printf(Message.RECOMMENDATION_END.getContent(), System.lineSeparator());
    }
}
