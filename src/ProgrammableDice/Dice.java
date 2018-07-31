package ProgrammableDice;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    public Dice() {
    }

    AddTwo addTwo = new AddTwo();
    TwiceLastNumber twiceLastNumber = new TwiceLastNumber();
    ExactSequence exactSequence = new ExactSequence();
    RandomNumber randomNumber = new RandomNumber();

    private int current;
    List<Integer> history = new ArrayList<>();

    public int rollDice() {
        current = randomNumber.generateNumber();
        addToHistory(current);
        randomNumber.isFinished();

        if (addTwo.isTriggered(history)) {
            current = addTwo.generateNumber();
            addTwo.isFinished();
        }

        if (twiceLastNumber.isTriggered(history)) {
            current = twiceLastNumber.generateNumber();
            twiceLastNumber.isFinished();
            randomNumber.generateNumber();
        }

        if (exactSequence.isTriggered(history)) {
            current = exactSequence.generateNumber();
            exactSequence.isFinished();
        } else {
            current = randomNumber.generateNumber();
            randomNumber.isFinished();
        }

        addToHistory(current);
        return current;
    }

    public void addToHistory(int number) {
        history.add(number);
    }

}
//ma dodawac do historii
//ma odpowiadać za generowanie tych wartości przy pomocy programów.
//Powinna natomiast mieć instancję historii i ostatecznie przy rzucie pobierać liczbę z aktualnego programu,
// dodawać do historii, robić wszystkie inne sprawdzenia np czy nie odpaliliśmy innego programu i ostatecznie zwracać ten numer