package ProgrammableDice;

import java.util.List;
import java.util.Random;

public class RandomNumber implements Program {

    public RandomNumber() {
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return false;
    }

    @Override
    public  int generateNumber() {
        Random random = new Random();
        int generated = random.nextInt(6) + 1;
        return generated;
    }
}