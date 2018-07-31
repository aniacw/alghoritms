package ProgrammableDice;

import java.util.List;

public class TwiceLastNumber implements Program {

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean isTriggered(List<Integer> history) {
        return history.get(history.size()-1) == 5;
    }

    @Override
    public  int generateNumber() {
        int generated = 5;
        return generated + '\n' + generated;
    }
}