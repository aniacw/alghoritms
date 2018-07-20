import org.junit.Assert;
import org.junit.Test;
import Alg8.Exe;

public class Alg8Tester {
    //dla showNumbers() tez?

    @Test
    public void raiseToPowerTest() {
        Exe.raiseToPower(2, 4);
        //Assert.assertEquals();
    }

    @Test
    public void divByATest() {
        Exe.divByA(2,8);

    }

    @Test
    public void isPrimaryTest() {
        Exe.isPrimary(3,10);
    }

    @Test
    public void isOddTest() {
        Exe.isOdd(3,12);
    }

    @Test
    public void fibTest() {
        Exe.fib(4,30);
    }

    @Test/// test void method?
    public void sumNumbersTest() {
        Exe.sumNumbers(4,6);
        //Assert.assertEquals(15,);
    }

    @Test
    public void sumDigitsTest() {
        Exe.sumDigits(3,5);
        //Assert.assertEquals(3, );
    }

}
