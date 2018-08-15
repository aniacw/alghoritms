import org.junit.Assert;
import org.junit.Test;

public class UDLRTester {

    @Test
    public void method(){
        UDLR udlr = new UDLR();
        boolean test = udlr.method("uud");
        Assert.assertFalse(test);
    }

    @Test
    public void method2(){
        UDLR udlr = new UDLR();
        boolean test = udlr.method("udrl");
        Assert.assertTrue(test);
    }

    @Test
    public void method3(){
        UDLR udlr = new UDLR();
        boolean test = udlr.method("uudllrlrrd");
        Assert.assertTrue(test);
    }

    @Test
    public void method4(){
        UDLR udlr = new UDLR();
        boolean test = udlr.method("dldlruuuuu");
        Assert.assertFalse(test);
    }
}
