package ProgrammableDice;

import java.util.List;

public class ExactSequence implements Program {

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public int rollDice() {
        return 0;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return false;
    }
}
