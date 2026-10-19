import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> result = new ArrayList<>();

        for (String argument : var) {
            result.add(argument);
        }

        return result;
    }
}
