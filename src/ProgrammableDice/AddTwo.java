package ProgrammableDice;

import java.util.List;
import java.util.Scanner;

public class AddTwo implements Program {

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return history.get(history.size()-1) == 2;
    }

    private int generated = 0;

    @Override
    public int generateNumber() {
        int firstThrown = 2;

        Scanner scanner = new Scanner(System.in);
        int remainingThrows = scanner.nextInt();

        while (remainingThrows > 0) {
            generated = (firstThrown + 2) % 6 + 1;
            firstThrown = (firstThrown + 2) % 6;
            remainingThrows--;
        }
        return generated;
    }
}