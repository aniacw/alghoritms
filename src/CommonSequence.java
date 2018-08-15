
public class CommonSequence {

    String findSeq(String word1, String word2) {
        //String longer = word1;
        //String shorter = word2;
        String sequence = "";
        //char commonLetter;

        //if (shorter.length() > longer.length()) {
         //   String temp = shorter;
          //  shorter = longer;
          //  longer = temp;
       // }

        for (int i1 = 0; i1 < word1.length(); i1++) {
            for (int i2 = 0; i2 < word2.length(); i2++) {
                if (word1.charAt(i1) == word2.charAt(i2)) {
                    int i1s = i1 + 1;
                    int i2s = i2 + 1;
                    while (i1s < word1.length() && i2s < word2.length() && word1.charAt(i1s) == word2.charAt(i2s)){
                        ++i1s;
                        ++i2s;
                    }
                    int seqLen = i1s - i1;
                    if (seqLen > sequence.length())
                        sequence = word1.substring(i1, i1s);
                }
            }
        }

      return sequence;
    }
}


//
//    Napisz funckcję, która dostaje 2 słowa i znajduje najdłuższy wspólny ciąg znaków,
//        który znajduje się w obu słowach.
//        Np: "sequence", "queen" -> "que"
