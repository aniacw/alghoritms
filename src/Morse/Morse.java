package Morse;

import java.util.*;

public class Morse {

    static List<String> morseCodeAlph = new ArrayList(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----."));

    static List<String> alphabet = new ArrayList(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9"));

    static HashMap<String, String> morseAlphabet = new HashMap<>();

    public static String translate(String input) {

        int index = 0;
        StringBuilder translated = new StringBuilder();
        String[] separateLetters = input.split(" ");

        for (int i = 0; i < separateLetters.length; i++) {
            //String latinLetter = morseAlphabet.get(separateLetters[i]);

            for (String currentLetter : morseCodeAlph) {
                if (separateLetters[i].equalsIgnoreCase(currentLetter)) {
                    index = morseCodeAlph.indexOf(currentLetter);
                    translated.append(alphabet.get(index));
                }
            }
        }
        return translated.toString();
    }

    public static void main(String[] args) {
        System.out.println("Type something in Morse...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(translate(input));

    }
}


//    Napisz program, który wczytuje napis w postaci _, . i spacji, np:
//        .___ ___ .... _.
//        i interpretuje ten napis jako kod Morse'a. Spacja oddziela poszczególne litery,
//        '.' oznacza kropkê w kodzie, '_' oznacza kreskê. W podanym przyk³adzie napis ten oznacza "john".
//        Program powinien wczytaæ napis od u¿ytkownika, sprawdziæ czy jest poprawny, tzn czy zawiera tylko kreski, kropki i spacje.
//        Nastêpnie odkodowaæ go i wyœwietliæ napis w naszym alfabecie.