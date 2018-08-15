import org.junit.Assert;
import org.junit.Test;

public class CommonSequenceTester {

    @Test
    public void findSeqTest() {
        CommonSequence cm = new CommonSequence();
        String test = cm.findSeq("application", "apple");
        Assert.assertEquals("appl", test);
    }

    @Test
    public void findSeqTest2() {
        CommonSequence cm = new CommonSequence();
        String test = cm.findSeq("matador", "prado");
        Assert.assertEquals("ado", test);
    }

    @Test
    public void findSeqTest3() {
        CommonSequence cm = new CommonSequence();
        String test = cm.findSeq("owl", "rainbow");
        Assert.assertEquals("ow", test);
    }
}
