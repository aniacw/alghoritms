package ProgrammableDice;

import java.util.Random;

public class RandomNumber extends Program {

    @Override
    public  int rollDice() {
        Random random = new Random();
        int rolled = random.nextInt(6) + 1;
        Program.currentNumber = rolled;
        History.addToList(Program.currentNumber);
        Program.isProgramFinished = true;
        return Program.currentNumber;
    }
}