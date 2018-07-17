package Alg8;

public class Exe {

    static void raiseToPower(int a, int b) {

        for (int n = a; n <= b; n++) {
            System.out.println(n * n);
        }
    }

    static void divByA(int a, int b) {

        for (int n = a; n <= b; n++) {
            if (n % a == 0) {
                System.out.println(n);
            }
        }
    }

    static void isPrimary(int a, int b) {
        int primary = 0;

        for (int n = a; n <= b; n++) {

            for (int i = 2; i <= n; i++) {
                if (n % i != 0)
                    primary = n;
            }
            System.out.println(primary);
        }
    }

    static void isOdd(int a, int b) {

        for (int n = a; n <= b; n++) {
            if (n % 2 == 1)
                System.out.println(n);
        }
    }

    static void fib(int a, int b) {
        int prev1 = 0;

        for (int n = a; n <= b; n++) {
            if (n == 0)
                System.out.println("1");

            else if (n == 1)
                System.out.println("1 1");

            else {
                for (int i = 0; i <= b; i++) {
                    if (i == a) {
                        prev1 = i;
                    }
                }
                int prev2 = 1;

                int current = prev2 + prev1;
                b -= 3;

                while (n >= a && n <= b) {
                    prev2 = prev1;
                    prev1 = current;
                    current = prev2 + prev1;
                    System.out.println(current);
                    --n;
                }
            }
        }
    }

    static void sumNumbers(int a, int b) {
        int sum = 0;
        for (int n = a; n <= b; n++) {
            sum += n;
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
            System.out.println("raise to power");
            raiseToPower(a, b);
            System.out.println("div by a");
            divByA(a, b);
            System.out.println("primary");
            isPrimary(a, b);
            System.out.println("odd");
            isOdd(a, b);
            System.out.println("fibonacci");
            fib(a, b);
            System.out.println("sum numbers");
            sumNumbers(a, b);
            System.out.println("sum digits");
            sumDigits(a, b);
        }
    }

    public static void main(String[] args) {
        showNumbers(3, 10);
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