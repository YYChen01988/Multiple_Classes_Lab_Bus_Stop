import java.util.ArrayList;

public class BusStop {
    ArrayList<Passenger> queue;

    public BusStop(){
        this.queue = new ArrayList<>();
    }

    public int getNumberOfQueue(){
        return this.queue.size();
    }

    public void addWaitingPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }
}
