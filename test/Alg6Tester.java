import Alg6.Exe;
import org.junit.Assert;
import org.junit.Test;

public class Alg6Tester {

    @Test
    public void interlaceTest() {
        int[] array1 = new int[]{5, 3, 9, 7};
        int[] array2 = new int[]{1, 1};
        int[] arrayTest = Exe.interlace(array1, array2);
        Assert.assertArrayEquals(new int[]{5, 1, 3, 1, 9, 7}, arrayTest);
    }
}
