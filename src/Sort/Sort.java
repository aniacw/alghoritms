package Sort;

public class Sort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[j] = array[i];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {

        for (int n = 0; n < array.length - 1; n++) {
            while (array[n] > array[n + 1]) {
                array[n + 1] = array[n];
            }
            array[n + 1] = array[n];
        }
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            while (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }

    static void quickSort(int[] array) {

    }


    public static void main(String[] args) {
        int[] arraySelectionSort = new int[]{5, 9, 16, 48, 96, 7, 28};
        int[] arrayInsertionSort = new int[]{5, 9, 16, 48, 96, 7, 28};
        int[] arrayBubbleSort = new int[]{5, 9, 16, 48, 96, 7, 28};

        selectionSort(arraySelectionSort);
        insertionSort(arrayInsertionSort);
        bubbleSort(arrayBubbleSort);
    }
}


//
//    Zaimplementuj funkcje
//    void selectionSort(int[] array)
//    void insertionSort(int[] array)
//    void bubbleSort(int[] array)
//    void quickSort(int[] array)
//    Opisy poszczególnych algorytmów znajdziesz w internecie. Postaraj siê nie posi³kowaæ gotowym kodem

