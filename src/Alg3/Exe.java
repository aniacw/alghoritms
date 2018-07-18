package Alg3;

public class Exe {

    int sumDigit = 0;
    int sumFinal = 0;
    int finalSum = 0;

    public int digitSum(int n) {
        while (n > 0) {
            sumDigit += n % 10;
            n = n / 10;
        }
        return sumDigit;
    }

    public int finalDigitSum(int n) {
        while (n > 0) {
            sumFinal += n % 10;
            n = n / 10;
        }
        while (sumFinal >= 10) {
            finalSum += sumFinal % 10; //1
            sumFinal = sumFinal / 10;  //2
        }
        return finalSum+sumFinal;
    }

    public static void main(String[] args){
        int n = 451254; //21
        Exe exe = new Exe();
        System.out.println(exe.digitSum(n));
        System.out.println(exe.finalDigitSum(n));
    }



}
//    Napisz funkcjê, która liczy sumê cyfr liczby
//    int digitSum(int n)
//Przyk³ad:
//        n = 19998
//        wynik: 36
//
//        Napisz funkcjê
//        finalDigitSum(int n)
//        która liczy sumê cyfr liczby, nastêpnie sumê cyfr tego wyniku itd. a¿ wynikiem bêdzie liczba < 10
//        Przyk³ad:
//        n = 19998
//        wynik po 1 sumowaniu: 36
//        wynik po 2 sumowaniu: 9
