package validator;

import java.util.List;
import menus.AllMenus;
import utill.InputSplit;
import view.OutputView;

public class CantEatFoodValidator {

    public static final int MINIMUM_NUMBER_OF_CANT_EAT_FOOD = 0;
    public static final int MAXIMUM_NUMBER_OF_CANT_EAT_FOOD = 2;
    private final List<String> foods;

    public CantEatFoodValidator(String input) {
        this.foods = InputSplit.split(input);
    }

    public boolean validate(){
        if(!validNumberOfFoods()){
            OutputView.numberOfCantEatFoodIsWrong();
            return false;
        }
        if(!validNameOfFoods()){
            OutputView.cantEatFoodMenuDoesntExist();
            return false;
        }
        if(!checkDuplicateFood()){
            OutputView.duplicateName();
            return false;
        }
        return true;
    }

    private boolean validNumberOfFoods(){
        return foods.size() >= MINIMUM_NUMBER_OF_CANT_EAT_FOOD && foods.size() <= MAXIMUM_NUMBER_OF_CANT_EAT_FOOD;
    }

    private boolean validNameOfFoods(){
        for(String food:foods){
            if(!AllMenus.checkInMenu(food)){
                return false;
            }
        }
        return true;
    }

    private boolean checkDuplicateFood(){
        for(String food:foods){
            if(foods.indexOf(food) != foods.lastIndexOf(food)){
                return false;
            }
        }
        return true;
    }

}
