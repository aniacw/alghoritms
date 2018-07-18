import Alg1.VendingMachine;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class VendingMachineTester {
    @Test
    public void changeTest() throws Exception {
        VendingMachine machine = new VendingMachine(Arrays.asList(100,1,1,2,2,20,50));
        System.out.println(machine);
        List<Integer> change = machine.buy(125, Arrays.asList(100, 100));
        assert change.equals(Arrays.asList(50,20,2,2,1));
        System.out.println(change);
        System.out.println(machine);
    }

    @Test
    public void tooSmallAmountTest(){
        try {
            VendingMachine machine = new VendingMachine(Arrays.asList(100, 1, 1, 2, 2, 20, 50));
            List<Integer> change = machine.buy(225, Arrays.asList(100, 100));
        }
        catch (Exception e){
            return;
        }
        assert false;
    }
}
