package Sort;

public class Sort {

    static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int smaller = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[j] = array[i];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arraySelectionSort = new int[]{5, 9, 16, 48, 96, 7, 28};

        selectionSort(arraySelectionSort);
    }
}


//
//    Zaimplementuj funkcje
//    void selectionSort(int[] array)
//    void insertionSort(int[] array)
//    void bubbleSort(int[] array)
//    void quickSort(int[] array)
//    Opisy poszczególnych algorytmów znajdziesz w internecie. Postaraj siê nie posi³kowaæ gotowym kodem

// if (array[i + 1] < array[i]) {
//        int temp = array[i+1];
//        array[i + 1] = array[i];
//        array[i]=temp;