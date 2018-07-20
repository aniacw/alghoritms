import Binary.Program;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTester {

    @Test
    public void binaryOnesTest(){
        Program p = new Program();
        int test = p.binaryOnes(123); //01111011
        Assert.assertEquals(6, test);
    }

    @Test  // nie dziala
    public void binaryZeroesTest() {
        Program p = new Program();
        int test = p.binaryZeros(123);
        //01111011
        //00111101
        //...
        //00000001
        Assert.assertEquals(1, test);
    }
}
