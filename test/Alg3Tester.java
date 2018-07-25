import Alg3.Exe;
import org.junit.Assert;
import org.junit.Test;

public class Alg3Tester {

    @Test
    public void digitSumTest() {
        Exe e = new Exe();
        int test = e.digitSum(1234);
        Assert.assertEquals(10, test);
    }

    @Test
    public void finalDigitSumTest() {
        Exe e = new Exe();
        int test = e.finalDigitSum(12345);
        Assert.assertEquals(6, test);
    }
}
