package ProgrammableDice;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    Program currentProgram;

    List<Integer> history = new ArrayList<>();

    public void run() {


    }

    public void addToHistory(int number) {
        history.add(number);
    }

}
//ma dodawac do historii
//ma odpowiadać za generowanie tych wartości przy pomocy programów.
//Powinna natomiast mieć instancję historii i ostatecznie przy rzucie pobierać liczbę z aktualnego programu,
// dodawać do historii, robić wszystkie inne sprawdzenia np czy nie odpaliliśmy innego programu i ostatecznie zwracać ten numer