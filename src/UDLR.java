public class UDLR {

    public boolean method(String s) {
        int udCounter = 0;
        int rlCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u')
                udCounter++;
            if (s.charAt(i) == 'd')
                udCounter--;
            if (s.charAt(i) == 'l')
                rlCounter++;
            if (s.charAt(i) == 'r')
                rlCounter--;
        }
        return udCounter == 0 && rlCounter == 0;
    }
}

//    Napisz funckję która dostaje stringa złożonego tylko z liter u d l r (up down left right)
//    i sprawdzi czy trafilibyśmy w miejsce z którego wyszliśmy gdybyśmy podążali za takimi
//        wskazówkami na polu podobnym do szachownicy o nieograniczonej wielkości.
//        Np:
//        "ud" -> true
//        "u" -> false
//        "dddr" -> false
//        "ulluldddrrru" -> true