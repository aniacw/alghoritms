import org.junit.Assert;
import org.junit.Test;

public class FindWordTester {

    @Test
    public void findTest(){
        FindWord findWord  = new FindWord();
        String test = findWord.find("Ala;; ma(kota....a   kot ma*Ale");
        Assert.assertEquals("kota", test);
    }
}
