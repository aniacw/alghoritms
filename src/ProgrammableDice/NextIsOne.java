package ProgrammableDice;

public class NextIsOne extends Program {

    @Override
    public  int rollDice() {
        int next = 1;
        History.addToList(next);
        Program.isProgramFinished = true;
        return next;
    }
}
