package utill;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputSplit {
    public static List<String> split(String input){
        return Arrays.stream(input.split(",")).map(String::trim).collect(Collectors.toList());
    }
}
