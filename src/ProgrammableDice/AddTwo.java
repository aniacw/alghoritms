package ProgrammableDice;

import java.util.List;
import java.util.Scanner;

public class AddTwo implements Program {

//    @Override
//    public boolean isFinished() {
//        return true;
//    }

    public boolean isFinished = true;

//    @Override
//    public boolean isTriggered(List<Integer> history) {
//
//    }

    public void isTriggered2(List<Integer> history) {
        if (history.get(history.size()) == 2)
            rollDice();
    }

    @Override
    public int rollDice() {
        int firstThrown = 2;

        Scanner scanner = new Scanner(System.in);
        int remainingThrows = scanner.nextInt();
        int next = 0;

        while (remainingThrows > 0) {
            next = (firstThrown + 2) % 6 + 1;
            firstThrown = (firstThrown + 2) % 6;
            remainingThrows--;
        }
        isFinished();

        return next;
    }
}