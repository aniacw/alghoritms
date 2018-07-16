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
//        boolean isPrime = false;
//
//        for (int n = a; n <= b; n++) {
//
//            for (int i = 2; i <= n; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                } else {
//                    isPrime = true;
//                    isPrimary[index] = n;
//                    index++;
//                }
//            }
//        }
//        System.out.println(isPrimary);
//    }

    static void isOdd(int a, int b) {
        int[] odd = new int[b - a + 1];
        int index = 0;

        for (int n = a; n <= b; n++) {
            if (n % 2 == 1) {
                odd[index] = n;
                index++;
            }
        }
        System.out.println(odd);
    }

//    static void fib(int a, int b) {
//        int[] fib = new int[b - a + 1];
//        int index = 0;
//
//        for (int n = a; n <= b; n++) {
//            if (n == 0)
//                System.out.println("1");
//
//            else if (n == 1)
//                System.out.println("1 1");
//
//            else {
//                int prev2 = 1;
//                int prev1 = 1;
//                int current = prev2 + prev1;
//                n -= 3;
//
//                while (n >= a && n <= b) {
//                    prev2 = prev1;
//                    prev1 = current;
//                    current = prev2 + prev1;
//                    fib[index] = current;
//                    index++;
//                    --n;
//                }
//            }
//        }
//    }

    static void sumNumbers(int a, int b) {
        int sum = 0;
        for (int n = a; n <= b; n++) {
            sum = +n;
        }
        System.out.println(sum);
    }

    static void sumDigits(int a, int b) {
        int sum = 0;

        for (int n = a; n <= b; n++) {
            if (n > 10)
                sum += n % 10;
            else
                sum += n;
        }
        System.out.println(sum);
    }

    static void showNumbers(int a, int b) {
        if (a < b) {
//            raiseToPower(a, b);
//            divByA(a, b);
//            isPrimary(a, b);
//            isOdd(a, b);
//            fib(a, b);
//            sumNumbers(a,b);
//            sumDigits(a,b);

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