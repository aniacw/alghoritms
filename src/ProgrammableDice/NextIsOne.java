package ProgrammableDice;

public class NextIsOne extends Program {


    public static int rollDice() {
        int next = 1;
        History.addToList(next);
        Program.isProgramFinished = true;
        return next;
    }
}
