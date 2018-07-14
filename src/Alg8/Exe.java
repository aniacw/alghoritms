package Alg8;

public class Exe {

    static void raiseToPower(int a, int b) {
        int[] squared = new int[b - a + 1];
        int index = 0;

        for (int n = a; n <= b; n++) {
            squared[index] = n * n;
            index++;
        }
        System.out.println(squared);
    }

    static void divByA(int a, int b) {
        int[] divByA = new int[b - a + 1];
        int index = 0;

        for (int n = a; n <= b; n++) {
            if (n % a == 0) {
                divByA[index] = n;
                index++;
            }
        }
        System.out.println(divByA);
    }

//    static void isPrimary(int a, int b) {
//        int[] isPrimary = new int[b - a + 1];
//        int index = 0;
//
//        for (int n = a; n <= b; n++) {
//            if (n != n || n != 1) {
//                for (int i = 0; i <= n; i++) {
//                    if (n % 1 == 0) {
//                        isPrimary[0] = n;
//                        index++;
//                    }
//                }
//            }
//        }
//    }

    static void showNumbers(int a, int b) {
        if (a < b) {
            raiseToPower(a, b);
            divByA(a, b);
        }
    }

    public static void main(String[] args) {
        showNumbers(3, 6);
    }

}


//    Napisz program, który pobiera 2 liczby a i b. a musi buæ mniejsze od b. Nastêpnie spoœród liczb od a do b wypisuje:
//        wszystkie potêgi 2
//        wszystkie potêgi liczby a
//        wszystkie wielokrotnoœci liczby a
//        wszystkie liczby pierwsze
//        wszystkie liczby nieparzyste
//        wszystkie liczby Fibonacciego
//        sumê wszystkich liczb w³¹cznie z a i b
//        sumê cyfr wszystkich liczb w³¹cznie z a i b