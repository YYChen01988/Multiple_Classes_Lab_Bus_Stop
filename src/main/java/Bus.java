import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengerInBus;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerInBus = new ArrayList<>();
    }

//    public int getBusCapacity(){
//        return this.capacity;
//    }

    public int passengerCount() {
        return this.passengerInBus.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerInBus.size() < this.capacity){
            this.passengerInBus.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengerInBus.remove(0);
    }

}
