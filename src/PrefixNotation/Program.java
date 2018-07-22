package PrefixNotation;

import java.util.Stack;

public class Program {

    boolean isOperator(char i) {
        if (i == '+' || i == '-' || i == '*' || i == '/')
            return true;
        else
            return false;
    }

    char[] reverseArray(char[] array) {
        char[] reversedInput = new char[array.length];
        int index = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            reversedInput[index] = array[i];
            index++;
        }
        return reversedInput;
    }

    public String prefixToInfixConverter(String prefixInput) {

        char[] input = prefixInput.toCharArray();
        char[] reversedArray = reverseArray(input);

        Stack stack = new Stack();
        stack.push(reversedArray);

        for (int i = reversedArray.length - 1; i >= 0; i--) {
            String temp = "";
            if (isOperator(reversedArray[i])) {
                temp = "(" + reversedArray[i - 2] + reversedArray[i] + reversedArray[i - 1] + ')';
            } else {

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