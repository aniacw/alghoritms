package ProgrammableDice;

public class Play {
    public static void main(String[] args) {

        Dice dice=new Dice();
        dice.rollDice();

        RandomNumber r = new RandomNumber();
        r.generateNumber();

    }
}