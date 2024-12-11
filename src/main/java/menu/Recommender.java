package menu;

import java.util.List;
import utill.InputSplit;
import view.InputView;
import view.Message;

public class Recommender {
    public void run(){
        System.out.println(Message.RECOMMENDATION_START.getContent());
        List<String> coachNames = getCoachNames();
        System.out.println(coachNames);
    }

    private List<String> getCoachNames(){
        InputValidator inputValidator;
        String coachNames = "";
        boolean isValidated = false;
        while(!isValidated){
            coachNames = InputView.getCoachNames();
            inputValidator = new InputValidator(coachNames);
            isValidated = inputValidator.validateCoachName();
        }
        return InputSplit.split(coachNames);
    }

}
