package view;

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

    public static void menuDoesntExist(){
        System.out.println(ErrorMessage.INVALID_NAME_OF_MENU.getContent());
    }

    public static void duplicateName() {
        System.out.println(ErrorMessage.DUPLICATE_NAME_IS_EXIST.getContent());
    }
}
