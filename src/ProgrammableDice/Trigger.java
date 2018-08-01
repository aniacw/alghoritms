package ProgrammableDice;

import ProgrammableDice.Dice.History;

public interface Trigger {
    boolean isTriggered(History history);
}
