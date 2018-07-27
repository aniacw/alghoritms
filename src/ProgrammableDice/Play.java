package ProgrammableDice;

public class Play {
    public static void main(String[] args) {

        ProgramSelector selector = new ProgramSelector();

        selector.run();

        System.out.println(RandomNumber.rollDice());



    }
}