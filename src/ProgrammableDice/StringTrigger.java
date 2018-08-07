package ProgrammableDice;

import ProgrammableDice.Dice.History;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringTrigger implements Trigger {
    private String sequence;
    private int number = 0;
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    public StringTrigger(String sequence) {
        this.sequence = sequence;
    }

    public StringTrigger() {
    }

//    public int convert(String sequence) {
//        int pow10 = 1;
//        int begin = 0;
//
//        for (int n = sequence.length() - 1; n <= begin; n--) {
//            int charValue = Character.getNumericValue(sequence.charAt(n));
//            number += charValue * pow10;
//            pow10 *= 10;
//        }
//        return number;
//    }

//    public void verify(int n) {
//        if (!numbers.contains(n))
//            index++;
//    }
//
//    int index = 0;

//    @Override
//    public boolean isTriggered(History history) {
//        int counter = 0;
//        List<Integer> recent = history.last(sequence.length());
//        for (int i = 0; i < recent.size(); i++) {
//            verify(sequence.charAt(index));
//            if (recent.get(i) == sequence.charAt(index)) {
//                counter++;
//            }
//            index++;
//        }
//        return counter == sequence.length();
//    }

    @Override
    public boolean isTriggered(History history) {
        List<Integer> recent = history.last(sequence.length());
        Iterator<Integer> sequenceIterator = recent.listIterator();
        int i = 0;

        while (sequenceIterator.hasNext()) {
            if (sequence.charAt(i) == '1') {
                if (recent.get(i) == 1) {
                    return true;
                } else {
                    return false;
                }
            }
            else if (sequence.charAt(i) == '2') {
                if (recent.get(i) == 2) {
                    return true;
                } else {
                    return false;
                }
            }
            else if (sequence.charAt(i) == '3') {
                if (recent.get(i) == 3) {
                    return true;
                } else {
                    return false;
                }
            }
            else if (sequence.charAt(i) == '4') {
                if (recent.get(i) == 4) {
                    return true;
                } else {
                    return false;
                }
            }
            else if (sequence.charAt(i) == '5') {
                if (recent.get(i) == 5) {
                    return true;
                } else {
                    return false;
                }
            }
            else if (sequence.charAt(i) == '6') {
                if (recent.get(i) == 6) {
                    return true;
                } else {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
    // ta nie dziala

    public boolean isTriggered3(History history) {
        int counter = 0;
        List<Integer> recent = history.last(sequence.length());

        for (int k = 0; k < sequence.length(); k++) {

            for (int i = 0; i < recent.size(); i++) {

                if (sequence.charAt(k) == '1') {
                    if (recent.get(i) == 1) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (sequence.charAt(k) == '2') {
                    if (recent.get(i) == 2) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (sequence.charAt(k) == '3') {
                    if (recent.get(i) == 3) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (sequence.charAt(k) == '4') {
                    if (recent.get(i) == 4) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (sequence.charAt(k) == '5') {
                    if (recent.get(i) == 5) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (sequence.charAt(k) == '6') {
                    if (recent.get(i) == 6) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
        }
        return counter == sequence.length();
    }

    //ta dziala
//    @Override
//    public boolean isTriggered(History history) {
//        int counter = 0;
//        List<Integer> recent = history.last(sequence.length());
//
//        for (int i = 0; i < recent.size(); i++) {
//            for (int k = 0; k < sequence.length(); k++) {
//                if (recent.get(i) == 1) {
//                    if (sequence.charAt(k) == '1') {
//                        counter++;
//                    } else {
//                        break;
//                    }
//                    if (recent.get(i) == 2) {
//                        if (sequence.charAt(k) == '2') ;
//                        counter++;
//                    } else {
//                        break;
//                    }
//                    if (recent.get(i) == 3) {
//                        if (sequence.charAt(k) == '3') ;
//                        counter++;
//                    } else {
//                        break;
//                    }
//                    if (recent.get(i) == 4) {
//                        if (sequence.charAt(k) == '4') ;
//                        counter++;
//                    } else {
//                        break;
//                    }
//                    if (recent.get(i) == 5) {
//                        if (sequence.charAt(k) == '5') ;
//                        counter++;
//                    } else {
//                        break;
//                    }
//                    if (recent.get(i) == 6) {
//                        if (sequence.charAt(k) == '6') ;
//                        counter++;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//        return counter == sequence.length();
//    }

//    @Override
//    public boolean isTriggered(History history) {
//        int counter = 0;
//        List<Integer> recent = history.last(sequence.length());
//        for (int i = 0; i < recent.size(); i++) {
//            verify(sequence.charAt(index));
//            if (recent.get(i) == sequence.charAt(index)) {
//                counter++;
//            }
//            index++;
//        }
//        return counter == sequence.length();
//    }

    // @Override
//    public boolean isTriggeredv2(History history) {
//        int counter = 0;
//        List<Integer> recent = history.last(sequence.length());
//        for (int i = 0; i < recent.size(); i++) {
//            for (int k = 0; k < sequence.length(); k++) {
//                if (!numbers.contains(sequence.charAt(k)))
//                    k++;
//
//                if (recent.get(i) == sequence.charAt(k))
//                    counter++;
//            }
//        }
//        return counter == sequence.length();
//    }
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