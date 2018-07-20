package ArrayShifting;

public class Exe1 {

    public void shiftLeft(int[] array) {
        int t = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = t;
    }

    public void shiftRight(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public void shiftLeftN(int[] array, int n) {
        for (int j = 0; j < n; j++) {
            int t = array[0];

            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }
            array[array.length - 1] = t;
        }
    }

    public void shiftLeftN2(int[] arr, int n) {
        if (arr.length == 0)
            return;
        n = n % arr.length;
        int[] help = new int[n];
        for (int i = 0; i < n; i++) {
            help[i] = arr[i];
        }

        for (int k = n; k < arr.length; k++) {
            arr[k - n] = arr[k];
        }
        //1 2 3 4 5
        //1 2 3
        //4 5 3 4 5

        for (int b = 0; b < n; ++b) {
            arr[arr.length - n + b] = help[b];
        }
    }

    public void shiftRightN(int[] array, int n) {


        for (int i = 0; i < n; i++) {
            int last = array[array.length - 1];

            for (int a = array.length - 1; a > 0; a--) {
                array[a] = array[a - 1];
            }
            array[0] = last;
        }
    }


    public void shiftRightN2(int[] array, int n) {
        if (array.length == 0)
            return;
        int[] help = new int[n];
        int index = 0;
        for (int i = array.length - 1 - n; i < n; i++) {
            help[index] = array[i];
            index++;
        }

        for (int i = array.length - 1 - n; i > 0; i--) {
            array[i + 1] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[i] = help[i];
        }
    }
}

//    Napisz trudniejsz¹ wersjê powy¿szej funkcji
//        void shiftLeft(int[] array, int n)
//        która przesunie w podobny sposób elementy w tablicy nie o jedno ale o 'n' pól
//        Przyk³ad:
//        mamy tablicê: {9,0,5,0,8,6,1};
//        wywo³ujemy: shiftLeft(tab, 3);
//        tablica zostanie przesuniêta o 3 pola w lewo: {0,8,6,1,9,0,5}
//
//    Napisz funkcjê
//    void shiftLeft(int[] array)
//    która przesunie w lewo o jedno pole wszystkie elementy w tablicy, a ostatni prze³o¿y na pocz¹tek.
//        Przyk³ad:
//        tablicê {3,4,7,8,0} przesunie w taki sposób: {4,7,8,0,3}

//
//W analogiczny sposób napisz funkcje shiftRight(int[] array) oraz shiftRight(int[] array, int n)