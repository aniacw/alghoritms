package ProgrammableDice;

import ProgrammableDice.Dice.Dice;

public abstract class Program {
    private Trigger trigger;
    protected Dice dice;

    protected Program(Trigger trigger) {
        this.trigger = trigger;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public abstract boolean isFinished();

    public abstract int generateNumber();

    public Trigger getTrigger() {
        return trigger;
    }
}

//        Napisz klasę ProgramableDice, która jest rozszerzoną wersją standardowej kostki do gry.
//
//        Założenie jest takie, że rzucamy kostką i dostajemy jakiś wynik w postaci inta, ale nie jest on zawsze losowany
//        albo nie zawsze tak samo.
//
//        Do kostki można dodawać programy, które aktywują różne tryby losowania / generowania
//        liczb w zależności od wystąpienia różnych sytuacji. Warunki jakie mogą inicjować programy to wyrzucenie jakiegoś
//        ciągu liczb (w szczególności może to być jedna liczba).
//
//        Aktywowany program powinien wpływać na kolejne wyrzucone liczby:
//        - wyrzucenie określonego ciągu liczb w kolejnych rzutach
//        - wyrzucenie ciągu liczb, który w jakiś sposób zależy od poprzednio wyrzuconych (np przedostatni rzut + 1, ostatni rzut - 2)
//        - zmiana zakresu losowania
//        - zmiana prawdopodobieństwa wyrzucenia różnych liczb
//        W każdym momencie może być aktywny maksymalnie jeden program. Jeśli aktualnie korzystamy z programu, nie losujemy liczb
//        standardowym trybem (tzn random z przedziału 1 do ilości ścian kostki).
//        Przykład:
//        Kostka 6-ścienna
//        dodajemy programy:
//        po wyrzuceniu 4,2,3 kolejne liczby to na 1,1,1
//        po wyrzuceniu 3 kolejna liczba to 2
//        po wyrzuceniu 6 kolejne 4 liczby są wyrzucane z prawdopodobieństwem: 1:10% 2:10% 3:10% 4:0% 5:50% 6:30%
//
//        wyrzucamy:
//        1
//        2
//        6 [3 program]
//        5
//        6 [nie aktywujemy bo program jeszcze działa]
//        3
//        5 [koniec programu 3]
//        2
//        4
//        3 [program 2]
//        2 (wynika z programu) [koniec programu 2]
//        5
//        5
//        4
//        2
//        3 [program 1, ciąg: 2,3]
//        1
//        1
//        1 [koniec programu 1]
//        ...
