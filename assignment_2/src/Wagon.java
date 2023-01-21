import java.util.ArrayList;

public class Wagon {
    public int seats;
    public int id;
    public ArrayList<Passenger> passengers;
    public double capacity;


    public Wagon(){}
    public Wagon(int seats, int id, double capacity){
        this.seats = seats;
        this.id = id;
        this.capacity = capacity;
        passengers = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getSeats() {
        return seats;
    }

}
