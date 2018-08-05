package ProgrammableDice.Dice;

import ProgrammableDice.Trigger;

public class StringTrigger implements Trigger {
    private String sequence;
    private int number = 0;

    public StringTrigger(String sequence) {
        this.sequence = sequence;
    }

    public StringTrigger() {
    }

    public int convert(String sequence) {
        int pow10 = 1;
        int begin = 0;

        for (int n = sequence.length() - 1; n <= begin; n--) {
            int charValue = Character.getNumericValue(sequence.charAt(n));
            number += charValue * pow10;
            pow10 *= 10;
        }
        return number;
    }

    @Override
    public boolean isTriggered(History history) {
        return (history.last(sequence.length())).equals(String.valueOf(sequence));
    }
}


//    W tym stringu wzorca moga występować
//        1-6 konkretne cyfry, które oznaczają że oczekujemy że była wyrzucona ta cyfra,
//        * oznaczająca że w tym miejscu mógł wystąpić dowolny rzut
//        > przed liczbą określa że następna cyfra określa minimalną wartość oczekiwanego rzutu
//        < przed liczbą określa że następna cyfra określa maksymalną wartość oczekiwanego rzutu
//        ! przed liczbą określa że oczekujemy cyfry innej niż ta za !
//        ? przed liczbą określa że następna cyfra mogła wystąpić albo nie
//
//        Przykłady:
//        "122" - ostatnie 3 rzuty musiały wynosić 122
//        "11**" - ostatnie 4 rzuty mogły wynosić: 1123 albo 1111 albo 1164 itp
//        ">3*" - minimum 3 i dowolny rzut: 45, 35, 56, 51, 32, itp (analogicznie działałby znak <)
//        "5?34" - 5, później możliwe że 3, później 4, czyli zarówno sekwencje 534 jak i 54 inicjują
//        "!6*6" - było coś co nie jest 6, potem dowolny rzut, potem 6