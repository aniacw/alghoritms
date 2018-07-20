package StringConverter;

public class Converter {

    public static int toInt(String s) {
        boolean isNegative = false;
        int index = 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            index = 1;
        }

        int number = 0;

        for (int i = index; i < s.length(); i++) {

            for (int n = s.length(); ; i--) {


                number = s.charAt(i) *
            }
        }

        if (isNegative)
            number = -number;

        System.out.println(number);
        return number;
    }

    public static void main(String[] args) {
        toInt("12345");
    }
}


//    Napisz samodzielnie funkcjê, która przekonwertuje stringa na int. Bêdzie musia³a przeiterowac po znakach stringa i
//    w zale¿noœci od tego na której pozycji jest dany znak dodaæ odpowiedni¹ wartoœæ do wynikowej liczby.
//    Np dla stringa "457" funkcja zsumuje 4*100 + 5*10 + 7. Funkcja musi te¿ brac pod uwagê, ¿e pierwszy znak mo¿e byæ minusem.
//
//    Funkcja bêdzie mia³a sygnaturê:
//    int toInt(String s)
//
//    Funckcja powinna pomijaæ spacje czyli string "  - 34 " zostanie zinterpretowany tak samo jak "-34"
//
//    Funkcja wyrzuca IllegalArgumentException jeœli s jest nullem, jest pusty, albo zawiera nieprawid³owy ci¹g znaków, czyli
//    zawiera jakikolwiek znak poza 0 1 2 3 4 5 6 7 8 9 - oraz spacj¹ albo zawiera wiêcej ni¿ 1 minus
//
//    Napisz testy dla tej funckji