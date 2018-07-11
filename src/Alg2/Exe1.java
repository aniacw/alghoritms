package Alg2;

public class Exe1 {

    public void shiftLeft(int[] array) {
        int t = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length-1] = t;
    }

    public  void shiftLeft2(int[] array) {

            int a = array[0];
            int i;
            for (i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];
            array[i] = a;
        }
    }



//
//    Napisz funkcjê
//    void shiftLeft(int[] array)
//    która przesunie w lewo o jedno pole wszystkie elementy w tablicy, a ostatni prze³o¿y na pocz¹tek.
//        Przyk³ad:
//        tablicê {3,4,7,8,0} przesunie w taki sposób: {4,7,8,0,3}