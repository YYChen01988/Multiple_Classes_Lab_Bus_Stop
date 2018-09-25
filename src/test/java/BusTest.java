import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;


    @Before
    public void before(){
        bus = new Bus("Glasgow", 2);
        passenger = new Passenger();

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

    @Test
    public void countPassengerNumber(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void addPassengerWhenBusIsNotFull(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void doNotAddPassengerWhenBusIsFull(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void PasssengerLeftTheBus() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());

    }
}
