package menu;

import java.util.List;
import utill.InputSplit;
import view.OutputView;

public class InputValidator {

    public static final int MAX_NUMBER_OF_COACH = 5;
    public static final int MIN_NUMBER_OF_COACH = 2;
    public static final int MIN_LENGTH_OF_NAME = 2;
    public static final int MAX_LENGTH_OF_NAME = 4;

    private List<String> coachNames;

    public InputValidator(String input) {
        this.coachNames = InputSplit.split(input);
    }

    public boolean validateCoachName(){
        if(!validNameOfCoach()){
            OutputView.coachNameLengthIsWrong();
            return false;
        }
        if(!validNumberOfCoach()){
            OutputView.numberOfCoachIsWrong();
            return false;
        }
        if(!duplicateNameCheck()){
            OutputView.duplicateName();
            return false;
        }
        return true;
    }

    private boolean validNameOfCoach(){
        for(String coachName : coachNames){
            if(coachName.length() < MIN_LENGTH_OF_NAME && coachName.length() > MAX_LENGTH_OF_NAME){
                return false;
            }
        }
        return true;
    }

    private boolean validNumberOfCoach(){
        return coachNames.size() >= MIN_NUMBER_OF_COACH && coachNames.size() <= MAX_NUMBER_OF_COACH;
    }

    private boolean duplicateNameCheck(){
        for(String coachName : coachNames){
            if(coachNames.indexOf(coachName) != coachNames.lastIndexOf(coachName)){
                return false;
            }
        }
        return true;
    }

}
