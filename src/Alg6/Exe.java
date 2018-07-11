package Alg6;

import java.util.Arrays;

public class Exe {

    int a1Index = 0;
    int a2Index = 0;

    static int[] interlace(int[] a1, int[] a2) {
        int[] combined = new int[a1.length + a2.length];
        int shorterLen;
        int[] longerArr;
        if (a1.length > a2.length){
            shorterLen = a2.length;
            longerArr = a1;
//            int[] t = a2;
//            a2 = a1;
//            a1 = t; //shorter
        } //po tych dzialaniach w a1 jest zawsze krotsza lub takiej samej dlugosci
        else {
            shorterLen = a1.length;
            longerArr = a2;
        }

        int ia;
        int ic = 0;
        for (ia = 0; ia < shorterLen; ++ia) {
            combined[ic] = a1[ia];
            combined[ic + 1] = a2[ia];
            ic += 2;
        }
        for (; ia < longerArr.length; ++ia){
            combined[ic] = longerArr[ia];
            ++ic;
        }
        return combined;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4};
        int[] a2 = new int[]{};
        int[] b = interlace(a1, a2);
        System.out.println(Arrays.toString(b));

    }
}


//    Napisz funkcjê
//    int[] interlace(int[] a1, int[] a2)
//    która przy wywo³aniu pobiera w argumentach 2 tablice.
//        Nastêpnie tworzy now¹ tablicê o rozmiarze a1.length + a2.length i wk³ada do niej na przemian elementy z 2 tablic a1 i a2.
//        Je¿eli skoñcz¹ siê elementy w jednej z tablic, na koniec dok³adana jest reszta elementów z drugiej tablicy.
//        Funkcja zwraca pust¹ tablicê jeœli obie tablice s¹ puste.
//        Wyrzycany jest wyj¹tek IllegalArgumentException jeœli którakolwiek z tablic jest nullem
//        Przyk³ad 1:
//        a1: {4,4,4,4,4}
//        a2: {5,5,5,5}
//        funkcja zwróci tablicê: {4,5,4,5,4,5,4,5,4,4}
//        Przyk³ad 2:
//        a1: {3,4,8,8}
//        a2: {0,1,1,0}
//        funkcja zwróci tablicê: {3,0,4,1,8,1,8,0}
//        Przyk³ad 3:
//        a1: {1,2,3,4}
//        a2: {9,9,9,9,9,9,9}
//        funkcja zwróci tablicê: {1,9,2,9,3,9,4,9,9,9,9}
//
//        Napisz testy dla tej funckji pokrywaj¹ce wszystkie przypadki jej u¿ycia.