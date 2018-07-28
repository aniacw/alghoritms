package ProgrammableDice;

public class TwiceLastNumber extends Program {

    @Override
    public  int rollDice() {
        int last = Program.currentNumber;
        History.addToList(last);
        History.addToList(last);
        Program.isProgramFinished = true;
        return last + '\n' + last;
    }
}