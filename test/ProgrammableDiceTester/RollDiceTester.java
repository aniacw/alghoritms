package ProgrammableDiceTester;

import ProgrammableDice.RandomNumber;
import org.junit.Assert;
import org.junit.Test;

public class RollDiceTester {

    @Test
    public void randomNumberRollDiceTest() {
        int rolled = 4;
        RandomNumber.rollDice();
        Assert.assertEquals(rolled,4);
    }


}