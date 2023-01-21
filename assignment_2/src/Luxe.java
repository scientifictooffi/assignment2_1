import java.util.ArrayList;

public class Luxe extends Wagon{
    public ArrayList<Passenger> passengers;
    public Luxe(){}

    public Luxe(int seats, int id, double capacity){
        super(seats,id,capacity);
        passengers = new ArrayList<>();

    }
}
