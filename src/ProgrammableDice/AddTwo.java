package ProgrammableDice;

import java.util.Scanner;

public class AddTwo extends Program {

    @Override
    public  int rollDice() {
        int firstThrown = Program.currentNumber;
        Scanner scanner = new Scanner(System.in);
        int remainingThrows = scanner.nextInt();
        int next = 0;

        while (remainingThrows > 0) {
            next = (firstThrown + 2) % 6 + 1;
            firstThrown = (firstThrown + 2) % 6;
            History.addToList(next);
            remainingThrows--;
        }
        Program.isProgramFinished = true;
        return next;
    }
}