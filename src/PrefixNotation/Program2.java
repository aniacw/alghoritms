package PrefixNotation;

import java.util.Scanner;
import java.util.Stack;

public class Program2 {

    private static class Node {
        public String value;


        public Node(String value) {
            this.value = value;
        }


        public String toInfix(){
            return value;
        }
    }

    private static class OperatorNode extends Node{
        public Node left;
        public Node right;


        public OperatorNode(String value) {
            super(value);
        }


        public OperatorNode(String value, Node left, Node right) {
            super(value);
            this.left = left;
            this.right = right;
        }


        @Override
        public String toInfix() {
            return "(" + left.toInfix() + " " + value + " " + right.toInfix() + ")";
        }
    }

    private static class ParseException extends Exception {
        private String input;
        private int pos;


        public ParseException(String message, String input, int pos) {
            super(message);
            this.input = input;
            this.pos = pos;
        }

        @Override
        public String getMessage(){
            return super.getMessage() + " In expression: " + input + " at position " + pos;
        }
    }

    private static class Parser{
        private int pos = 0;

        private Node parse(String expr, int begin) throws Program2.ParseException {
            for (pos = begin; pos < expr.length(); ++pos){
                char c = expr.charAt(pos);
                if (isOperator(c)){
                    OperatorNode node = new OperatorNode("" + c);
                    while (++pos < expr.length() && Character.isWhitespace(expr.charAt(pos))){}
                    node.left = parse(expr, pos);
                    node.right = parse(expr, pos);
                    return node;
                }
                else if (Character.isDigit(c)){
                    int i = pos;
                    while (i < expr.length() && Character.isDigit(expr.charAt(i)))
                        ++i;
                    Node node = new Node(expr.substring(pos, i));
                    pos = i;
                    return node;
                }
                else if (Character.isWhitespace(c))
                    continue;
                else
                    throw new Program2.ParseException("Illegal character found.", expr, pos);
            }
            throw new Program2.ParseException("Syntax error, unexpected end of input.", expr, pos);
        }


        public Node parse(String expr) throws Program2.ParseException {
            pos = 0;
            return parse(expr, 0);
        }
    }


    static boolean isOperator(char i) {
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
        return null;
    }

    public static void main(String[] args){
        Parser parser = new Parser();
        Scanner scanner =new Scanner(System.in);
        try {
            Node root = parser.parse(scanner.nextLine());
            System.out.println(root.toInfix());
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

//        Napisz Program2 który wykonuje translację wyrażeń arytmetycznych z notacji polskiej na klasyczną infixową.
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