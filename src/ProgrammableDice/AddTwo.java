package ProgrammableDice;

import java.util.ListIterator;

public class AddTwo extends Program {
    private ListIterator<Integer> iterator;
    private int repetitions;
    private int counter = 0;

    public AddTwo(Trigger trigger,  int repetitions) {
        super(trigger);

        this.repetitions = repetitions;
    }

    @Override
    public boolean isFinished() {
        if (repetitions == counter) {
            counter = 0;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int generateNumber() {
        counter++;
        int n = dice.getHistory().last();
        n = (n + 2) % 6;
        return n;
    }
}