package Fibonacci;

public class Program {

    public static int fib(int n) {
        System.out.println("fib(" + n + ")");
        if (n < 2) {
            System.out.println("return 1");
            return 1;
        } else {
            System.out.println("return fib(" + (n - 1) + ") + fib(" + (n - 2) + ")");
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib2(int n) {
        if (n == 0) {
            System.out.println("1");
            return 1;
        } else if (n == 1) {
            System.out.println("1 1");
            return 1;
        } else {
            System.out.print("1 1");
            int prev2 = 1;
            int prev1 = 1;
            int current = prev2 + prev1;
            n -= 3; //jezeli tu jestesmy to policzylismy juz 2 (1, 1)
            while (n >= 0) {
                System.out.print(" " + current);
                prev2 = prev1;
                prev1 = current;
                current = prev2 + prev1;
                --n;
            }
            System.out.print(" " + current);
            System.out.println();
            return current;
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<10;++i)
            Program.fib2(i);
    }
}

////Napisz program, który pobiera liczbê n i wyœwietla n pocz¹tkowych liczb ci¹gu Fibonacciego.