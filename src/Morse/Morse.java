package Morse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Morse {

    static List<String> morseCodeAlph = new ArrayList(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----."));

    static List<String> alphabet = new ArrayList(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9"));

    public static String translate(String input) {

        int index = 0;
        String translated = "";
        String[] separateLetters = input.split(" ");

        for (int i = 0; i < separateLetters.length; i++) {
            for (String currentLetter : morseCodeAlph) {
                if (separateLetters[i].equalsIgnoreCase(currentLetter)) {
                    index = morseCodeAlph.indexOf(currentLetter);
                    translated = translated.concat(alphabet.get(index));
                }
            }
        }
        System.out.println(translated);
        return translated;
    }

    public static void main(String[] args) {
        System.out.println("Type something in Morse...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        translate(input);
        System.out.println(translate(input));
    }
}


//    Napisz program, który wczytuje napis w postaci _, . i spacji, np:
//        .___ ___ .... _.
//        i interpretuje ten napis jako kod Morse'a. Spacja oddziela poszczególne litery,
//        '.' oznacza kropkê w kodzie, '_' oznacza kreskê. W podanym przyk³adzie napis ten oznacza "john".
//        Program powinien wczytaæ napis od u¿ytkownika, sprawdziæ czy jest poprawny, tzn czy zawiera tylko kreski, kropki i spacje.
//        Nastêpnie odkodowaæ go i wyœwietliæ napis w naszym alfabecie.