package Alg3;

public class Exe {

    int sum = 0;
    int finalSum = 0;

    int digitSum(int n) {
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    int finalDigitSum(int n) {
        digitSum(n);  //21
        while (sum >= 10) {
            finalSum += sum % 10; //1
            sum = sum / 10;  //2
        }
        return finalSum+sum;
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
