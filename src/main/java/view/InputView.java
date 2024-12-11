package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getCoachNames(){
        System.out.println(Message.GET_COACH_NAME.getContent());
        return getLine();
    }

    public static String getCantEatFood(){
        System.out.println(Message.GET_CANT_EAT.getContent());
        return getLine();
    }

    private static String getLine(){
        return Console.readLine();
    }

}
