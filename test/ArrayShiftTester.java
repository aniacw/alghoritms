import org.junit.Assert;
import org.junit.Test;
import ArrayShifting.Exe1;

public class ArrayShiftTester {

    @Test
    public void shiftLeftTest() {
        //Given
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //When
        e.shiftLeft(array1);

        //Then
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1}, array1);
    }

    @Test
    public void shiftRightTest() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftRight(array1);
        Assert.assertArrayEquals(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, array1);
    }

    @Test
    public void shiftLeftNTest() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftLeftN(array1, 4);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }

    @Test
    public void shiftRightNTest() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftRightN(array1, 5);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }
}
