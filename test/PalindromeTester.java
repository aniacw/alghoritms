import org.junit.Assert;
import org.junit.Test;

public class PalindromeTester {

    @Test
    public void palindromeTestFalse(){
        Palindrome p = new Palindrome();
        boolean test = p.isPalidrome("cupcake");
        Assert.assertFalse(test);
    }

    @Test
    public void palindromeTestTrue(){
        Palindrome p = new Palindrome();
        boolean test = p.isPalidrome("poiumuiop");
        Assert.assertTrue(test);
    }

    @Test
    public void palindromeTestTrue2(){
        Palindrome p = new Palindrome();
        boolean test = p.isPalidrome("poiuuiop");
        Assert.assertTrue(test);
    }
}
