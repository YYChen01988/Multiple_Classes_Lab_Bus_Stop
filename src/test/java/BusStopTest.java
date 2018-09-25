import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop();
        passenger = new Passenger();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.getNumberOfQueue());
    }

    @Test
    public void peopleGetIntoQueue() {
        busStop.addWaitingPassenger(passenger);
        assertEquals(1,busStop.getNumberOfQueue());
    }

    @Test
    public void peopleLeftQueue() {
        busStop.addWaitingPassenger(passenger);
        busStop.addWaitingPassenger(passenger);
        assertEquals(2,busStop.getNumberOfQueue());
        busStop.waitingPassengerLeft();
        assertEquals(1,busStop.getNumberOfQueue());
    }
}
