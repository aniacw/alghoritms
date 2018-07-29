package ProgrammableDice;

import java.util.List;

public class TwiceLastNumber implements Program {

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
        int last = Program.currentNumber;


        return last + '\n' + last;
    }
}