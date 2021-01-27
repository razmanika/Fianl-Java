import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    Train train=new Train();
    @Test
    public void StationSquareAdd() {
        assertEquals(true, train.addPassanger(passanger));
        assertEquals(false,train.addPassanger(passanger1));
    }



}
