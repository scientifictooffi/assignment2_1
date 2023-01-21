import java.util.ArrayList;

public class RestourantWagon extends Wagon{
    public ArrayList<Passenger> passengers;
    public RestourantWagon(){}

    public RestourantWagon(int seats, int id, double capacity){
        super(seats,id,capacity);
        passengers = new ArrayList<>();

    }
}
