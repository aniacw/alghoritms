package Alg2;

public class Exe1 {

    public void shiftLeft(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = array.length - 1; i > 0; i--) {
            newArray[i - 1] = array[i];
        }

        newArray[array.length - 1] = array[0];
    }
}


//
//    Napisz funkcjê
//    void shiftLeft(int[] array)
//    która przesunie w lewo o jedno pole wszystkie elementy w tablicy, a ostatni prze³o¿y na pocz¹tek.
//        Przyk³ad:
//        tablicê {3,4,7,8,0} przesunie w taki sposób: {4,7,8,0,3}