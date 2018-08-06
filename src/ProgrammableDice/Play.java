package ProgrammableDice;

import ProgrammableDice.Dice.Dice;

public class Play {
    public static void main(String[] args) {

        Dice dice = new Dice();
        dice.addProgram(new ExactSequence(new StringTrigger("11"), 2, 2));
        //dice.addProgram(new RepeatLastNumber(new SequenceTrigger(4, 3), 3));
        //dice.addProgram(new ExactSequence(new SequenceTrigger(2), 1,1));
       // dice.addProgram(new AddTwo(new SequenceTrigger(3), 5));
        for (int i = 0; i < 100; ++i)
            System.out.print(dice.roll() );


//        StringTrigger stringTrigger = new StringTrigger();
//        System.out.println(stringTrigger.convert("1234"));
//        System.out.println(String.valueOf("1234"));
    }


}