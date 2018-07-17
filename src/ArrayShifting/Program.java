package ArrayShifting;

public class Program {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Exe1 e = new Exe1();

        e.shiftLeft(array1);
        e.shiftRight(array2);
        e.shiftLeftN(array3, 2);
        e.shiftRightN(array4, 3);
    }
}
