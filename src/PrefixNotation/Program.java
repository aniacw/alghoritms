package PrefixNotation;

public class Program {

    boolean isOperator(char i) {
        if (i == '+' || i == '-' || i == '*' || i == '/')
            return true;
        else
            return false;
    }

    public String prefixToInfixConverter(String prefixInput) {

        for (int i = prefixInput.length(); i > 0; i--) {
                if(isOperator(prefixInput.charAt(i))) {

                }
        }

    }
}

//        Napisz program który wykonuje translację wyrażeń arytmetycznych z notacji polskiej na klasyczną infixową.
//        Nasze wyrażenia w postaci prefixowej składają się tylko z liczb i operatorów: + - / *
//        Wyrażenia w postaci infixowej moga mieć też nawiasy ( ) do określania kolejności działań.
//        Liczby i operatory są oddzielone pojedynczą spacją (nieco trudniejsza wersja: dowolną ilością spacji).
//        Przykłady translacji:
//
//        in:  - 5 * 4 3
//        out: 5 - (4 * 3)
//
//        in:  * 7 - 1 - 11 + 98 2
//        out: 7 * (1 - (11 - (98 + 2)))
//
//        in:  - - 4 5 9
//        out: (4 - 5) - 9