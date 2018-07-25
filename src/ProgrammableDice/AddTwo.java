package ProgrammableDice;

import java.util.ArrayList;
import java.util.List;

public class AddTwo extends Program{

    static List<Integer> addTwo(int firstThrown, int remainingThrows) {
        List<Integer> rolled = new ArrayList<>();
        int next = 0;
        while (remainingThrows > 0) {
            next = (firstThrown + 2) % 6;
            firstThrown = (firstThrown + 2) % 6;
            if (next != 0) {
                rolled.add(next);
                remainingThrows--;
            }
        }
        return rolled;
    }
}
