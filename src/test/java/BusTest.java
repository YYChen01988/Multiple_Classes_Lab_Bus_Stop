import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Glasgow");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerToBus() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }
}
