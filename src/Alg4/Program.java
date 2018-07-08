package Alg4;

public class Program {

    int binaryOnes(int n) {
        int count1 = 0;
        int binDigit = 0;
        while (n > 0 ) {
            binDigit = n % 2;
            if (binDigit == 1) {
                count1++;
            }
        }
        return count1;
    }

    int binaryZeros(int n) {
        int count0 = 0;
        int binDigitTemp = 0;
        while (n > 0) {
            binDigitTemp = n % 2;
            if (binDigitTemp == 0) {
                count0++;
            }
        }
        return count0;
    }

    public static void main(String[] args){
        int number = 25;

        Program p = new Program();
        p.binaryOnes(number);
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
