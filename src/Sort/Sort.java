package Sort;

import java.util.Arrays;

public class Sort {

    public static void selectionSort(int[] array) {  //szuka najmniejszego i wstawia na poczatek
        //3 2 4 1
        //1 2 4 3
        //1 2 4 3
        //1 2 3 4
        for (int i = 0; i < array.length - 1; i++) {
            int imin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[imin]) {
                    imin = j;
                }
            }

            int tmp = array[imin];
            array[imin] = array[i];
            array[i] = tmp;
        }
    }

    public static void insertionSort(int[] array) {

        for (int n = 1; n < array.length; n++) {
            int temp = array[n];
            int i = n - 1;

            while (i >= 0 && array[i] > temp) {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        for (int end = array.length - 1; end > 0; --end) {
            for (int i = 0; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    static void quickSort(int[] array) {
        int leftCursor = 0;
        int rightCursor = array.length - 1;
        int pivot = array[rightCursor];
        int temp = 0;
        for (int i = 0; i < pivot; i++) {

            leftCursor++;
            rightCursor--;
            if ((leftCursor > pivot) && (rightCursor < pivot)) {
                temp = leftCursor;
                leftCursor = rightCursor;
                rightCursor = temp;
            }

        }


    }


    public static void main(String[] args) {
        int[] arraySelectionSort = new int[]{5, 9, 16, 48, 96, 7, 28};
        int[] arrayInsertionSort = new int[]{5, 9, 16, 48, 96, 7, 28};
        int[] arrayBubbleSort = new int[]{5, 9, 16, 48, 96, 7, 28};

        selectionSort(arraySelectionSort);
        System.out.println(Arrays.toString(arraySelectionSort));
        insertionSort(arrayInsertionSort);
        System.out.println(Arrays.toString(arrayInsertionSort));
        bubbleSort(arrayBubbleSort);
        System.out.println(Arrays.toString(arrayBubbleSort));
    }
}


//
//    Zaimplementuj funkcje
//    void selectionSort(int[] array)
//    void insertionSort(int[] array)
//    void bubbleSort(int[] array)
//    void quickSort(int[] array)