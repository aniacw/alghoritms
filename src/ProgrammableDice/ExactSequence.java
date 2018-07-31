package ProgrammableDice;

import java.util.List;

public class ExactSequence implements Program {

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public int generateNumber() {
        return 4;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return history.get(history.size()-1) == 1 && history.get(history.size()-2) == 3;
    }
}
