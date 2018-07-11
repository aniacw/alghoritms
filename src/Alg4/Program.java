package Alg4;

public class Program {
    String ones = "";
    String zeroes = "";

    int binaryOnes(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }

    int binaryZeros(int n) {
        for (int i = 0; i < 5; i++) {
            if (n % 2 == 0) {
                zeroes = zeroes + "1";
                n = n / 2;
            }
        }
        System.out.println(zeroes.length());
        return zeroes.length();
    }

    public static void main(String[] args) {
        int number = 744 ;

        Program p = new Program();
        System.out.println(p.binaryOnes(number));
        //p.binaryZeros(number);
    }

}
//
//    Napisz funkcjê, która policzy jedynki w binarnej reprezentacji liczby.
//        int binaryOnes(int n)
//
//        Napisz funkcjê, która policzy zera w binarnej reprezentacji liczby.
//        int binaryZeros(int n)
//
//        Nie u¿ywaj Integer.toBinaryString
