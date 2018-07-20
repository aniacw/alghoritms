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
        e.shiftLeftN2(array1, 4);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }

    @Test
    public void shiftLeftNTest2() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftLeftN2(array1, 4);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }

    @Test
    public void shiftLeftNTest3() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftLeftN2(array1, 13);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }

    @Test
    public void shiftLeftNTest4() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftLeftN2(array1, 0);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array1);
    }

    @Test
    public void shiftLeftNTest5() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftLeftN2(array1, -1);
        Assert.assertArrayEquals(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, array1);
    }

    @Test
    public void shiftLeftNTest6() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{};
        e.shiftLeftN2(array1, 3);
        Assert.assertArrayEquals(new int[]{}, array1);
    }

    @Test
    public void shiftLeftNTest7() {
        Exe1 e = new Exe1();
        try {
            e.shiftLeftN2(null, 3);
        } catch (NullPointerException ex) {
            return;
        }
        assert false;
    }

    @Test
    public void shiftRightNTest() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftRightN(array1, 5);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, array1);
    }

    @Test
    public void shiftRightNTest2() {
        Exe1 e = new Exe1();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        e.shiftRightN2(array1, 3);
        Assert.assertArrayEquals(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6}, array1);
    }
}
