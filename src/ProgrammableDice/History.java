package ProgrammableDice;

import java.util.ArrayList;
import java.util.List;

public class History {

    private static List<Integer> rolled = new ArrayList<>();// ????????

    public History() {
        this.rolled = new ArrayList<>();
    }

    public static void addToList(int number) {
        rolled.add(number);
    }

    public List<Integer> getRolled() {
        return rolled;
    }
}
