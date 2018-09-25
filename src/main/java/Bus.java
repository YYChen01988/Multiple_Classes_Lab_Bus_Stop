import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Passenger> passengerInBus;

    public Bus(String destination){
        this.destination = destination;
        this.passengerInBus = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengerInBus.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengerInBus.add(passenger);
    }
}
