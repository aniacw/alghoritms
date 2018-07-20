import org.junit.Assert;
import org.junit.Test;
import Morse.Morse;

public class MorseTester {

    @Test
    public void morseTest() {
        String input = "-.-. .- .-.. .. ..-. --- .-. -. .. .-";
        String test = Morse.translate(input);
        Assert.assertTrue("California".equalsIgnoreCase(test));
    }
}
