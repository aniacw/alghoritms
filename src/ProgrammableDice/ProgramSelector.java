package ProgrammableDice;

public class ProgramSelector {

    Program program;

    public void run() {
        RandomNumber.rollDice();

        if(Program.currentNumber == 3) {
            NextIsOne.rollDice();
            RandomNumber.rollDice();
        }

        if(Program.currentNumber == 2) {
            AddTwo.rollDice();
            RandomNumber.rollDice();
        }
        //itd.
    }
}
