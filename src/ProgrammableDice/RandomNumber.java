package ProgrammableDice;

import java.util.List;
import java.util.Random;

public class RandomNumber implements Program {

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return false;
    }

    @Override
    public  int rollDice() {
        Random random = new Random();
        int rolled = random.nextInt(6) + 1;
        Program.currentNumber = rolled;

        Program.isProgramFinished = true;
        return Program.currentNumber;
    }
}