package ProgrammableDice;

import java.util.Random;

public class RandomNumber extends Program {

    public int rollDice() {
        Random random = new Random();
        int rolled = random.nextInt(6) + 1;
        return rolled;
    }

}
