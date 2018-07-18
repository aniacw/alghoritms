import org.junit.Assert;
import org.junit.Test;
import Sort.Sort;

public class SortTester {

    @Test
    public void selectionSortTest() {
        int[] array = new int[]{5, 9, 16, 3, 7, 45, 11};
        Sort.selectionSort(array);
        Assert.assertArrayEquals(new int[]{3, 5, 7, 9, 11, 16, 45}, array);
    }

    @Test
    public void insertionSortTest() {
        int[] array = new int[]{5, 9, 16, 3, 7, 45, 11};
        Sort.insertionSort(array);
        Assert.assertArrayEquals(new int[]{3, 5, 7, 9, 11, 16, 45}, array);
    }

    @Test
    public void bubbleSortTest() {
        int[] array = new int[]{5, 9, 16, 3, 7, 45, 11};
        Sort.bubbleSort(array);
        Assert.assertArrayEquals(new int[]{3, 5, 7, 9, 11, 16, 45}, array);
    }
}
