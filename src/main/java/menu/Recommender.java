package menu;

import java.util.List;
import utill.InputSplit;
import validator.CantEatFoodValidator;
import validator.NameValidator;
import view.InputView;
import view.Message;
import view.OutputView;

public class Recommender {

    private Coaches coaches;

    public Recommender() {
        coaches = new Coaches();
    }

    public void run() {
        System.out.println(Message.RECOMMENDATION_START.getContent());
        List<String> coachNames = getCoachNames();
        for (String coachName : coachNames) {
            coaches.add(coachName, getCantEatFoods(coachName));
        }
        RecommendationMachine recommendationMachine = new RecommendationMachine();
        List<Integer> weekCategories = recommendationMachine.getRandomCategories();
        recommendationMachine.setRandomFoodsByCoach(weekCategories, coaches);
        Result.print(weekCategories, coaches);
    }

    private List<String> getCoachNames() {
        NameValidator nameValidator;
        String coachNames = "";
        boolean isValidated = false;
        while (!isValidated) {
            coachNames = InputView.getCoachNames();
            nameValidator = new NameValidator(coachNames);
            isValidated = nameValidator.validate();
        }
        return InputSplit.split(coachNames);
    }

    private List<String> getCantEatFoods(String name) {
        CantEatFoodValidator foodValidator;
        String cantEatFoods = "";
        boolean isValidated = false;
        while (!isValidated) {
            cantEatFoods = InputView.getCantEatFood(name);
            foodValidator = new CantEatFoodValidator(cantEatFoods);
            isValidated = foodValidator.validate();
        }
        return InputSplit.split(cantEatFoods);
    }
}
