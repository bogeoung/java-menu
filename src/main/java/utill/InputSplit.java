package utill;

import java.util.List;

public class InputSplit {
    public static List<String> split(String input){
        return List.of(input.split(","));
    }
}
