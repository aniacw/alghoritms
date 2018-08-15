import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWord {

    List<String> alphabet = new ArrayList(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

    String find(String s) {
        String word = "";
        String finalWord = "";


        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                word += s.charAt(i);
            } else {
                if(word.length() > finalWord.length()){
                    finalWord = word;
                }
                word = "";
            }
        }
        if(word.length() > finalWord.length()){
            finalWord = word;
        }
        return finalWord;
    }
}

//    Napisz funckję która dostaje stringa i zwraca najdłuższy wyraz w tym stringu,
//    zakładając że słowa moga być oddzielone znakami białymi albo znakami interpunkcyjnymi.
//        Np: "Ala;; ma(kota....a   kot ma*Ale" -> "kota"